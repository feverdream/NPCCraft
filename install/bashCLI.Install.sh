#!/bin/bash
###############################################
# NPCCraft SQL Install Scrip Copyright (c) XAMPP 2010   #
###############################################
## === DEF VARS === ##
DBSERV='mysqld'
DBUSR=''
DBPAS=''
DB=''
SQLFILE='install.sql'
CURDIR=
DBBACKUP="$DB_"`eval date +%Y%m%d`""
## === Main Script === ##
echo "Looking For MySQL Deamon"
if ps ax | grep -v grep | grep $SERVICE > /dev/null
then
    echo "$DBSERV is running, everything is fine"
else
    echo "$DBSERV is not running"
    exit
fi
echo "Looking For install.sql"
if [ -f $SQLFILE ];
then
   echo "$SQLFILE exists"
else
   echo "File $SQLFILE  does not exists"
   exit
fi

echo "Connecting To MySQL....."

echo "Backing up Database '$DB'"

mysqldump --user=$DBUSR --password=$DBPASS --databases $DB --opt --quote-names --allow-keywords --complete-insert | bzip2 -c > $DBBACKUP.bz2

echo "Installing SQL Script"
