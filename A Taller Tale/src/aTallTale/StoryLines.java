package aTallTale;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
 
public class StoryLines {
	LinkedHashMap<String, Object> letmeout, meta2, fixplumbing2, plumbi, beg, root1, root2, root3, throwwindow,
			callhelp, examineclass, courtyard, lookcourtyard, liberal, paper, paper1, paper2, paper3, paper4, paper5,
			bush, yardcall, breakanother, sacrifice, meta, threat, silent, liberal2, start, godlypaper, mehpaper,
			crappypaper, basement, callhelp1, fixplumbing, stairdeath, descent, dungeon, jason, jason2, jason3,
			plumbingdeath;
	List<LinkedHashMap<String, Object>> papers;
	LinkedHashMap<String, Object> current;
	int pa;
	int papersscore;
int EndingFound;
 
	public StoryLines() {
EndingFound=0;
		pa = -1;
		papersscore = 0;
		papers = new ArrayList<LinkedHashMap<String, Object>>();
		godlypaper = new LinkedHashMap<String, Object>();
		dungeon = new LinkedHashMap<String, Object>();
		descent = new LinkedHashMap<String, Object>();
		jason = new LinkedHashMap<String, Object>();
		jason2 = new LinkedHashMap<String, Object>();
		jason3 = new LinkedHashMap<String, Object>();
		plumbingdeath = new LinkedHashMap<String, Object>();
		fixplumbing = new LinkedHashMap<String, Object>();
		fixplumbing2 = new LinkedHashMap<String, Object>();
		plumbi = new LinkedHashMap<String, Object>();
		letmeout = new LinkedHashMap<String, Object>();
		beg = new LinkedHashMap<String, Object>();
		meta = new LinkedHashMap<String, Object>();
		bush = new LinkedHashMap<String, Object>();
		stairdeath = new LinkedHashMap<String, Object>();
		meta2 = new LinkedHashMap<String, Object>();
		threat = new LinkedHashMap<String, Object>();
		silent = new LinkedHashMap<String, Object>();
		mehpaper = new LinkedHashMap<String, Object>();
		crappypaper = new LinkedHashMap<String, Object>();
		start = new LinkedHashMap<String, Object>();
		root1 = new LinkedHashMap<String, Object>();
		root2 = new LinkedHashMap<String, Object>();
		root3 = new LinkedHashMap<String, Object>();
		courtyard = new LinkedHashMap<String, Object>();
		throwwindow = new LinkedHashMap<String, Object>();
		callhelp = new LinkedHashMap<String, Object>();
		callhelp1 = new LinkedHashMap<String, Object>();
		examineclass = new LinkedHashMap<String, Object>();
		bush = new LinkedHashMap<String, Object>();
		yardcall = new LinkedHashMap<String, Object>();
		sacrifice = new LinkedHashMap<String, Object>();
		lookcourtyard = new LinkedHashMap<String, Object>();
		breakanother = new LinkedHashMap<String, Object>();
		liberal = new LinkedHashMap<String, Object>();
		liberal2 = new LinkedHashMap<String, Object>();
		paper = new LinkedHashMap<String, Object>();
		paper1 = new LinkedHashMap<String, Object>();
		paper2 = new LinkedHashMap<String, Object>();
		paper3 = new LinkedHashMap<String, Object>();
		paper4 = new LinkedHashMap<String, Object>();
		paper5 = new LinkedHashMap<String, Object>();
		basement = new LinkedHashMap<String, Object>();
 
		godlypaper.put("caption",
				"A warm light washes over the courtyard. You feel the individual rays forming themselves around the contours of your body, forming a perfect cocoon of bliss. Slowly, you begin to ascend to the heavens. The gods have embraced you as one of their own, and you have transcended human existence. \nCongratulations, you're won. (Ending 2 out of 8)");
		mehpaper.put("caption",
				"Nothing seems to happen. Perhaps you underestimated the complexity of the inscription, or overestimated the quality of your writing. Maybe you should try something else. Or write another paper. ");
		crappypaper.put("caption",
				"The skies slowly fade into a dark, bloody red. You stare up into the clouds, and a thick pair of horn-rimmed glasses stare back, with the sorrowful eyes of disappointment. This pain quickly intensifies into anger, as a green bolt of unintelligible writing strikes the ground you stand on. The fires of failure slowly engulf you as you burn to death, leaving nothing except a hastily written ‘vague’ down your lifeless back. \n(Ending 3 out of 8)");
		sacrifice.put("caption",
				"You make a small cut in your thumb, wincing as you do so, and let the little drops of red drip into the spout. You hear a small *clink*, and a key falls out of the fountain's bottom. The key says basements, and seems to correspond to an unmarked door in a bricked-up corner of the courtyard. Your blood seems to have lubricated the key that a custodian accidentally dropped down there.");
		throwwindow.put("caption",
				"You grab the heaviest and most redundant thing you can find, a textbook titled: Literature: An Introduction to Reading and Writing by Edgar V. Roberts and Robert Zweig, and you chuck it with as much force as humanly possible at the narrow and permanently shuttered window. After a few tries, the glass begins to crack, and soon shatters. You grab a large piece of the broken glass with your sleeves. This could be helpful later on. You climb out of the window, and drop five feet into a desolate courtyard.");
		courtyard.put("caption",
				"This courtyard seems to have tables, benches, and lots of greenery. However, it seems to be locked off and unused for quite a while now, perhaps for abstract bureaucratic reasons far outside your current scope of understanding.");
		lookcourtyard.put("caption",
				"Aside from the benches and bushes, there is a small fountain in a corner, long defunct. The inscription on it reads: Penalis esse adipiscendae liberationi. Your latin IB skills tell you that this translates roughly to: The Painful Path to Liberation. What could this mean? ");
		liberal.put("caption",
				"Equipped with a halfway decent understanding of Liberalism, you pontificate to the fountain for hours on end about the importance of artificial wage inflation and price control in a Social Democratic economy, and about the deep moral underpinnings of responsible governance in the modern world. Something begins to feel different to you, maybe a slight surging of magical energy in the air, taking your breath away.");
		liberal2.put("caption",
				"You continue to grandstand towards the fountain, despite an obvious lack of onlookers. The strange feeling begins to get stronger and stronger, until you can taste the tension on your sandpaper-like tongue, and the thirst for knowledge begins to wash over you. You fall to your knees and conclude your evaluation of Anarcho-capitalist governance with a quote from Thomas Piketty, before collapsing triumphantly on the ground. The feeling you had felt as you talked was not magic or enlightenment. It was thirst. A very real thirst for water, and not for knowledge. Your dry eyes slowly close, and your vision fades to black for the final time as you fall back into the grand design of things. You have literally talked yourself to death. \n(Ending 1 out of 8) ");
		paper.put("caption",
				"Clearly, an English teacher from up above has shown this statement to you so as to prevent you from writing a poor literature paper. You run quickly to the window you escaped from, and grab a pen and some paper. You are now ready to prove your worth to the gods above, by writing the perfect paper. How shall you begin?");
		paper1.put("caption",
				"You quickly jot down your selected work on the paper. You should find an idea to address, now. What should it be? ");
		paper2.put("caption",
				"You have finished your planning. How should you start the introduction and establish support?");
		paper3.put("caption",
				"Finishing your introduction, you must now transition into further development of your idea. How?");
		paper4.put("caption", "You're on fire! The conclusion is all that's left.");
		paper5.put("caption",
				"Scribbling the last remark, you add the final period to your conclusion. It is complete. You offer it to the gods of English and await judgment.");
		callhelp.put("caption",
				"You take a minute to gather your breath, and proceed to shriek at the top of your lungs towards the presumed location of the hallway. You pause for a moment to catch your breath, and then continue shrieking. This goes on for several more minutes. ");
		callhelp1.put("caption",
				"Suddenly, you hear a deep, booming voice from the other side of the heavy wooden door. “What are you doing here? All guests are to proceed to the main foyER. That’s the main foyER.”");
		fixplumbing.put("caption",
				"“Okay, so what are you doing locked up in an English classroom? Some part of this story doesn’t sit right with me.”");
		fixplumbing2.put("caption",
				"“That’s the most sorrowful excuse for a burglary I’ve ever heard,” the voice at the other side of the door booms. “I’m afraid I’m going to have to call the police on you.” Suddenly, without warning, the writers will an entire police force into existence, who promptly arrive on scene to arrest you. You are handcuffed and escorted off the edge of this very limited world, never to be heard from again. (Ending 4 out of 8) ");
		plumbi.put("caption",
				"“Nothing beside remains. I’m sorry, your highness, for failing to recognize you at first. I will take you to the leader of the school. He resides in the basement. I will take you there via the convenient method of plot holes, but you’ll have to approach him yourself. ”");
		beg.put("caption",
				"“*Sigh* I’m sorry, but I cannot open this door. You’re neither tired nor hungry. The writers haven’t even defined your being yet! For all you know, you could be a truck-sized salamander.”");
		meta.put("caption",
				"The tone of the voice softens slightly. “I feel you. The designers didn’t even give me a face. I’m just a floating voice...”");
		meta2.put("caption",
				"Well, now you’ve done it. Your incessant questioning and refusal to suspend even the slightest ounce of disbelief has led to the falling-apart of this poorly-conceived universe. The voice at the other side of the door screams as it’s torn apart, becoming a symphony of screams that gets louder, deeper, and more resonant every second. The walls everywhere fall apart, as you begin to hear your own scream dominate the increasingly distorted symphony. With a plop, you plunge back into the undefined heart of darkness. You’re not dead, but soon you will wish you were. \n(Ending 5 out of 8)");
		threat.put("caption",
				"“You understand that the concept of police does not currently exist within the bounds of this simulation, right? Even if you were to call on the hypothetical police with a hypothetical communications device, there’s no guarantee that they’ll suddenly materialize out of your free will alone.”");
		silent.put("caption",
				"After a while, the voice fades, and everything returns to its original state. You must be proud of yourself, aren’t you? Wasting time like this.");
		letmeout.put("caption",
				"“You’re right. But I can’t let you go out this way. Break that window over there, and enter the courtyard. There, you will find a fountain that holds the key to freeing you from this existence.”");
		examineclass.put("caption",
				"The writers let out a groan of annoyance as they let you glance around the classroom. There’s are a few desks, some textbooks on an obscure subject called “English”, and some posters that are too hard to read with the current screen display settings. ");
		start.put("caption", "Press 1 to proceed.");
		bush.put("caption",
				"In the bush, you find an old graduation cap, of a faded fluorescent pink, with a pacifier hanging off the top. The inscription inside reveals that it belonged to a mysterious monastic order, “The Order of the Pink Robes”... Congratulations. You have found an easter egg. ");
		root1.put("caption",
				"Sometimes, there are moments where you look back at life and find yourself welling up with not pride and nostalgia, but shame and regret. Peering over the precipice of hindsight, you find your accomplishments fading like dust into the Sahara of human achievement, yet your mistakes are amplified through a broken speakerphone with feedback problems, becoming louder and more distorted with every echo. This will be one of these moments. Or not. Truthfully, it will depend on a set of choices you are about to make very soon. So tread carefully, my friend.");
		root2.put("caption",
				"Our story begins in a conventional high school, shrouded in vagueness by my deliberate lack of description. Day by day, vaguely described teachers ramble on vaguely about vague subjects. This is a place where vagueness ebbs and flows through the hallways and classrooms. If you look carefully, you may even find a bit of vagueness haphazardly smeared on the walls in the toilet stalls. Great place. Therefore, it is with great vagueness that you find yourself in a certain classroom one day with uncertain motivations.");
		root3.put("caption",
				"Partly because the writers were too lazy to develop any characters for this part, you find yourself alone in this empty, locked classroom. The excruciating boredom eventually overcomes the (presumably) calming effect of my voice, and you find yourself at a dilemma. What do you do to alleviate the boredom? ");
		basement.put("caption",
				"After some time, You find yourself at the top of a steep stairway as the wrought-iron door slams shut unceremoniously behind you. You must now descend carefully, to meet your final destiny. How will you proceed? ");
		stairdeath.put("caption",
				"You slowly approach the top step with a small burst of energy. You breathe a sigh as your first foot leaves the slippery stone surface with expert accuracy. But then, your remaining foot slips, messing up your heroic pose and sending you tumbling down the relentless staircase. The last thing you hear is a loud crack directly underneath your jaw. You have come so close, yet were so far. \n(Ending 6 out of 8)");
		descent.put("caption",
				"Perhaps it’s the amazing amount of attention you paid to safety courses in Kindergarten, or your absolute lack of understanding in how the hero of an adventure story behaves, but you plop down on the floor and perform an action reminiscent of a poorly-executed crab-walk down the stairs, eventually reaching the bottom after an eternity. ");
		dungeon.put("caption",
				"Here you are. An upstart young hero about to face the final challenge. The fleeting winds of mold and rot (characteristic of a poorly-maintained basement) gently tickling your metaphorical cape. Although absolutely no plot development or set-up suggests it, you are quite sure that you will be face-to-face your ultimate nemesis very soon. You take a deep breath. The very thought of it, along with the asbestos you’ve inhaled just then, sends a shiver down your back.");
		jason.put("caption",
				"Slowly, a hunched figure materializes out of the shadows. A heavily accented voice slithers its way across the smooth stone floor, up your body, across your neck, and into your ear canal, “What you doing here? ");
		jason2.put("caption",
				"“Oh, you could’ve just said so. You see, if I put up a struggle, I award you the satisfaction of completing your ordained fate. But if I just surrender, I take away all the drama and there’s nothing you can do about it. So take that! I submit!” the mysterious villain brings himself to his own knees in defeat, before disintegrating himself in one final petty denial of satisfaction to you. Not even a corpse to claim as a trophy. ");
		jason3.put("caption", "The end. That’s it. \n(Ending 7 out of 8)");
		plumbingdeath.put("caption",
				"“You honestly thought that would work on me? I know all the plumbers in the immediate vicinity, and you are not one of them. The only thing worse than bad health is a bad name.” The mysterious villain smites you with an acute strain of cholera, aging you by 60 years, transporting you to a distant city named Cartagena, and leaving you bound to a fate of unrequited love. \n(Ending 8 out of 8) ");
		yardcall.put("caption", "Your voice echos aimlessly amongst the desolate brick walls.");
		start.put("image", "/aTallTale/aryana_goyande1.jpg");
		root1.put("image", "/aTallTale/root01.jpg");
		root2.put("image", "/aTallTale/root02.jpg");
		root3.put("image", "/aTallTale/root03.jpg");
		throwwindow.put("image", "/aTallTale/throwWindow.jpg");
		courtyard.put("image", "/aTallTale/Courtyard.jpg");
		bush.put("image", "/aTallTale/bush.jpg");
		yardcall.put("image", "/aTallTale/yardcall.jpg");
		lookcourtyard.put("image", "/aTallTale/looCcourtyard.jpg");
		liberal.put("image", "/aTallTale/liberal.jpg");
		liberal2.put("image", "/aTallTale/liberal2.jpg");
		paper.put("image", "/aTallTale/paper.jpg");
		paper1.put("image", "/aTallTale/paper1.jpg");
		paper2.put("image", "/aTallTale/paper2.jpg");
		paper3.put("image", "/aTallTale/paper3.jpg");
		paper4.put("image", "/aTallTale/paper4.jpg");
		paper5.put("image", "/aTallTale/paper5.jpg");
		godlypaper.put("image", "/aTallTale/godlyPaper.jpg");
		mehpaper.put("image", "/aTallTale/mehPaper.jpg");
		crappypaper.put("image", "/aTallTale/crappyPaper.jpg");
		sacrifice.put("image", "/aTallTale/sacrifice.jpg");
		callhelp.put("image", "/aTallTale/callHelp.jpg");
		callhelp1.put("image", "/aTallTale/door.jpg");
		fixplumbing.put("image", "/aTallTale/door.jpg");
		fixplumbing2.put("image", "/aTallTale/fixPlumbing2.jpg");
		plumbi.put("image", "/aTallTale/door.jpg");
		beg.put("image", "/aTallTale/door.jpg");
		meta.put("image", "/aTallTale/door.jpg");
		meta2.put("image", "/aTallTale/meta2.jpg");
		threat.put("image", "/aTallTale/door.jpg");
		silent.put("image", "/aTallTale/door.jpg");
		letmeout.put("image", "/aTallTale/door.jpg");
		examineclass.put("image", "/aTallTale/examineClass.jpg");
		basement.put("image", "/aTallTale/basement.jpg");
		stairdeath.put("image", "/aTallTale/stairDeath.jpg");
		descent.put("image", "/aTallTale/descent.jpg");
		dungeon.put("image", "/aTallTale/dungeon.jpg");
		jason.put("image", "/aTallTale/jason.jpg");
		jason2.put("image", "/aTallTale/dungeon.jpg");
		jason3.put("image", "/aTallTale/dungeon.jpg");
		plumbingdeath.put("image", "/aTallTale/plumbingDeath.jpg");
 
		yardcall.put("Won’t anybody be my friend?", courtyard);
 
		stairdeath.put("A slippery slope in more ways than one! ", start);
 
		descent.put("Safety is not funny. I wear my fluorescent orange vest with pride!", dungeon);
 
		dungeon.put("Out, damned villain! Out, I say!", jason);
		dungeon.put("Uh… I signed up for the wrong summer camp. I’m leaving. Now.", stairdeath);
 
		jason.put("I have come to defeat you!", jason2);
		jason.put("Uh… I’m here to fix the plumbing?", plumbingdeath);
 
		jason2.put("I better get at least a good ending dialogue out of this!", jason3);
 
		jason3.put("I really hate this villain guy…", start);
 
		plumbingdeath.put("Old people, with other old people, are not so old.", start);
 
		basement.put("Step down with your left foot.", stairdeath);
		basement.put("Step down with your right foot.", stairdeath);
		basement.put("Jump, and hope for the best.", stairdeath);
		basement.put("Get down on your butt and slowly scootch down the stairs.", descent);
 
		start.put("Proceed", root1);
 
		root1.put("Proceed", root2);
 
		root2.put("Proceed", root3);
 
		root3.put("Call loudly for help, hoping that someone that doesn't hate you hears you.", callhelp);
		root3.put("Look around the room, forcing the writers to be less vague.", examineclass);
 
		throwwindow.put("Proceed", courtyard);
 
		courtyard.put("Examine the bushes for something that might be useful.", bush);
		courtyard.put("Call out for help", yardcall);
		courtyard.put("Look for more options", lookcourtyard);
 
		lookcourtyard.put("It must be about the principles of Liberalism!", liberal);
		lookcourtyard.put("Probably a laughably vague English paper topic.", paper);
		lookcourtyard.put("Pain and sacrifice is the key to unlocking true meaning.", sacrifice);
		lookcourtyard.put("We gotta go back!", courtyard);
 
		liberal.put("Continue to explain the principles of classical vs. modern liberalism.", liberal2);
		liberal.put("Turn back. Something's not right.", lookcourtyard);
 
		liberal2.put("Not with a bang, but a wimper!", start);
 
		paper.put("I must select a great work of prose, like Love In The Time of Cholera.", 5);
		paper.put("Excellent poetry is the key. Perhaps something by Frost is in order.", 5);
		paper.put("Within drama lies the fundamental truths of mankind. A Streetcar Named Desire it is! ", 5);
		paper.put("They're probably seen millions of papers on books. How about Shrek! By William Steig, for a change?",
				-20);
 
		paper1.put("Love. It's always about love.", 0);
		paper1.put("The characters in the work are ultimately bound to obligations and expectations.", 10);
		paper1.put("Human nature is fluid and unpredictable, even in the most brutal of situations. ", 15);
		paper1.put("For one to be truly freed, a painful path must be undertaken to achieve liberation. ", -20);
		papers.add(paper1);
 
		paper2.put("Talk about a moment in school when the idea rang true to you and follow with general references.",
				10);
		paper2.put(
				"Allude to how the 1453 fall of Constantinople parallels the human truths you are about to explore. Follow with relevant quotes. ",
				15);
		paper2.put(
				"Summarize the plot of the work, and explain the attributes of every main character, with specific references to the plot.",
				0);
		paper2.put("Begin the paper by personally insulting the reader's family. That's gotta draw attention, right? ",
				-20);
		papers.add(paper2);
 
		paper3.put("Take a tangible concluding idea and link it to the beginning of a new paragraph.", 10);
		paper3.put("Don't transition. Just do it.", 0);
		paper3.put("Build a metaphor that runs through the entirety of the body paragraphs.", 15);
		paper3.put("Supplement your ideas with an integrated rainbow flowchart. Comic Sans.", -20);
		papers.add(paper3);
 
		paper4.put("Build up to a reasoned, logical conclusion, and end with a closing reference to your introduction.",
				15);
		paper4.put("Conclude by reiterating all the key points of your paper. ", 10);
		paper4.put("End with a cool movie quote, and nothing else.", 0);
		paper4.put("Rip the paper off immediately after your last paragraph to add suspense.", -20);
		papers.add(paper4);
 
		paper5.put("Here goes nothing...", 0);
		papers.add(paper5);
 
		godlypaper.put("The honour... the honour! ", start);
 
		mehpaper.put("Hmm...", courtyard);
 
		examineclass.put("It would seem that challenging the writers has yielded me absolutely no benefit… ", root3);
 
		crappypaper.put("But I put a lot of effort into that! ", start);
 
		sacrifice.put("Huh. Well, that was unnecessary.", basement);
 
		callhelp.put("What a waste of my and the writers' time...", callhelp1);
 
		callhelp1.put("Uh... I'm here to fix the plumbing?", fixplumbing);
		callhelp1.put("I have no idea who I am, or what I’m doing here. The writers were too lazy to tell me anything.",
				meta);
		callhelp1.put("Let me out of here! I’ll have you arrested otherwise! ", threat);
		callhelp1.put("Stay silent.", silent);
 
		fixplumbing.put(
				"You see, there is hidden plumbing in this room, and I forgot to bring my toolbox to access it.",
				fixplumbing2);
		fixplumbing.put("I am Plumbimandius, king of the plumbers! Look upon my work, ye mighty, and despair! ",
				plumbi);
		fixplumbing.put("Please, sir. I’m tired, hungry, and just want to go home! Let me out! ", beg);
		fixplumbing.put("Remain silent.", silent);
 
		plumbi.put("Fair enough.", basement);
 
		meta.put("Well, now’s your chance to fix this! Let me out!", letmeout);
		meta.put(
				"If you’re just a floating voice, why are you self-aware of your existence as a floating voice? You have no cognitive faculties. Also, why am I even here? Why are you even here?!",
				meta2);
		meta.put("Eww. No, thanks. Bye.", examineclass);
		meta.put("Remain silent.", silent);
 
		bush.put("All hail the Grandmaster! ", courtyard);
 
		root3.put("Find a heavy object and throw it out of a window. ", throwwindow);
 
		examineclass.put("It would seem that challenging the writers has yielded me absolutely no benefit… ", root3);
 
		fixplumbing2.put("...despite the constant negative police prosefefe!", start);
 
		letmeout.put("Thanks. Well, that shouldn’t be too hard… ", throwwindow);
 
		silent.put("Quicker than going to the main menu.", root3);
 
		threat.put("That’s a valid point, presumably.", callhelp1);
 
		meta2.put("Somebody once told me, The world was gonna roll me…", start);
 
		beg.put("*Hisses in disappointment*", fixplumbing);
 
		plumbi.put("Fair enough.", basement);
 
		current = start;
	}
 
	public String[] getchoice(String[] ci) {
		Set<String> keys = current.keySet();
		int a = 0;
		for (String key : keys) {
			ci[a] = key;
			a++;
		}
		return ci;
	}
 
	public String cap() {
		return (String) current.get("caption");
	}
 
	public String image() {
		return (String) current.get("image");
	}
 
	public void nextscene(String picked) {
		if (current == paper) {
			pa++;
			papersscore = 50;
		}
		if (pa <= 4 && pa > -1) {
			papersscore += (Integer) current.get(picked);
			current = papers.get(pa);
			pa++;
		} else if (pa == 5) {
			if (papersscore >= 100) {
				current = godlypaper;
			} else if (papersscore >= 40) {
				current = mehpaper;
			} else {
				current = crappypaper;
			}
			pa = -1;
		} else {
			current = (LinkedHashMap<String, Object>) current.get(picked);
		}
if(current==start)
		{
			EndingFound++;
			System.out.println(EndingFound+"/8 endings are found!");
		}
 
	}
}