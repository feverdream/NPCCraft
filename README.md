# NPCCraft 

NPCCRaft is a hey0 Mod for Adding Living NPC's To Alpha Servers

## Introduction:

Okay so i got into making Hmod Plugins (<a href="https://github.com/traitor/Minecraft-Server-Mod">hey0's Minecraft Server</a>) and i saw a cool Plugin,
Craftizens and it had NPC's and i got to thinking, 'Wow wouldn't a cool mod be to have Live NPC's with some level of ai and Interaction?' 
yes it would. so Thus NPCCraft is born it will be a mod that lets The Server Admin Create Living NPC's that can (hopefully) interact with you and the world. 

## Requirements:
<ul>
<li><a href="">Hay0's Minecraft Server mod </a></li>
<li>Server Running On MySQL</li>
</ul>
	
## Installation:

No Instructions At this Current Point in Time

## Usage:

To Crate an NPC you would issue the Command:

<pre>
/npcc mk [name] [aiscript] [alignment(good|evil|chaotic|neutral)] [boundaryname]
</pre>

To Remove an NPC you would issue the Command:

<pre>
/npcc rmv [name]
</pre>
To alter The NPC's AI Script you would issue:

<pre>
/npcc edt ai [name] [aiscript]
</pre>
To Alter The alignment of the NPC you would issue:

<pre>
/npcc edt alignment [name]  [alignment(good|evil|chaotic|neutral)]
</pre>
To Alter The Boundary The NPC is Restricted to you would issue:

<pre>
/npcc edt boundary [name] [boundaryname]
</pre>
Note: The NPC will warp to the center of the new boundary when the command is issued

To Set the Home for the NPC you would issue:

<pre>
/npcc set home [name]
</pre>
Note: The NPC will warp to the center its home
Note: The NPC home will be set to your location from where you issued the command

To list all NPC's
<pre>
/npcc list
</pre>
 To get the Plugin Version:
<pre>
/npcc version
</pre>

To get info about the plugin and server:
<pre>
/npcc about
</pre>

To Bring up help:
<pre>
/npcc help [if(!command) lists commands]
</pre>
<pre>
/npcc ? [if(!command) lists commands]
</pre>

To Edit the propertys file in game:
<pre>
/npcc cfg [get|set|toggle] [propname] [if(set) == propvalue]
</pre>

## FAQ:

Q. Can I use Flatfile rather than MySql?
A. No you May not. The fact is the Way NPCcraft works is that it needs to read of the MySQL database.


Q. Can i use this in Single Player?
A. No You may not this is a hey0 Mod for the Alpha Server.


Q. Can i use this on a normal Alpha server?
A. No like stated before this is a hey0 mod and wil only work with hey0


Q. I Relay Like This Project But it Has Some Bugs Where can i report these?
A. You Can Report Bugs Over at the Issue Tracker on the Github Project.


Q. I am a Java Dev and i want to Help, how can i?
A. you can Fork Our project on Github And We and merge the Changes that we think are good

Q. How Do i Install NPCCraft?
A. You can start by Reading the INSTALL Document the Comes with Every Release of NPCCraft.

Q. HALP ITS NOT WORKING!!!111!!!oneoneone!!!11
A. If you have Issues Read The Support Section In the Documentation Or post in this topic.

Q. Oh no I installed it and My Server Crashed What Happened?
A. This Plugin is in Alpha So its not Stable at all so it might do that.