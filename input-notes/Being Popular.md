**Being Popular**
**
**
*The mechanics of popularity*
	- Most people don’t choose languages based on merit but because we’re told to use it
	- Hackers and designers disagree on what is a good language
	- Hackers opinion matters more because language is a tool for them to use; designed to suit imperfect humans
	- Expert hackers write best software, influence the rest
	- Popularity makes languages better because of real-life support from others
	- Language has to be popular to be good and stay popular to remain good
	- Best way to get initial 20 users is with application they want written in a new language
		- Harder to go 0-20 than 20-10,000

*External factors*
	- Language has to be the scripting language of a popular system
	- To design a popular language, either have to supply more than a language or design a language that can replace a scripting language of an existing system
	- A language isn’t based on its own merits
	- A programming language isn’t one unless its also the scripting language of something

*Brevity*

	- Hackers are lazy and hate anything extraneous
	- Hackers choose which language based on total characters to type
	- It matters a lot how code lines up on the page
	- Individual tokens should be short too
		- Cost of long name is typing, reading, screen space

*
*
*Hackability*

	- Most important for hackers is to do what they want to do
	- Language designers should target genius as user who will need things they can’t anticipate rather than a retard who needs to be protected from himself
	- Good programmers want to do dangerous and unsavoury things
		- Ex: getting hold of the internal representation of some high-level abstraction
	- Hackers like to hack and hacking means getting inside things and second guessing the original designer
	- Let yourself be second-guessed
	- Classic macros are a real hacker’s tool - simple, powerful, dangerous
		- Call a function on the macro’s arguments and whatever it returns is inserted in place of the macro call
	- A really good language should be clean and dirty
		- Cleanly designed with a small core of well-understood and highly orthogonal operators
		- Dirty int he sense that it lets hackers have their way with it
			- C is like this

*
*
*Throw-away programs*

	- Language has to be good for writing throw-away programs
	- Throw-away programs are those which you write quickly for some limited task (ex. converting data format)
	- Many don’t get thrown away and evolve into real programs with real features and users
	- Best big programs begin this way
		- Terrifying to build something big from scratch
		- Overwhelmed when taking on big tasks
		- Project either gets bogged down or sterile and wooden
	- Start big program with throw-away that you keep improving
		- Less daunting approach and design benefits from evolution

*Libraries*

	- More functions the better, but too much can be a problem
	- Small set of orthogonal operators

*Syntax*

	- More structure: easier, cleaner, less ability
	- Less structure: harder, dirtier, more ability

*Efficiency*

	- Good language generates fast code
		- Speed only matters in certain critical bottlenecks
			- Bottlenecks are often mistakenly identified
	- The way to get fast code is a very good profiler
	- You need to be able to declare all the types of arguments in the bottleneck and where the bottleneck actually is
	- A good profiler may do more to improve the speed of actual programs written in the language than a compiler that generates fast code
		- Active profiler that pushes performance data to programmer is ideal
		- Algorithms can be used to detect inefficient code based on patterns
	- Users are interested in response time but the number of simultaneous users you can support per processor is also very important
	- In some apps, processor will be the limiting factor and execution speed will be the most important thing to minimize
		- Often though, memory will be the limit as the number of simultaneous users will be determined by how much memory you need for each user’s data

*
*
*Time*

	- Language needs to be around for a while to be adopted
	- You need time to get any message through to people
	- People often ask for things they turnout not to want so rarely do anything on the first ask but until they ask a bunch
	- The majority of hot new whatever turns out to be a waste of time and eventually go away
		- Many don’t start paying attention until they’ve heard about it a lot of times
	- Simple repetition solves the problem
		- Keep telling your story and eventually people will start to hear
		- It’s not when people notice you’re there that they pay attention; its when they notice you’re still there
	- Usually takes a while to gain momentum
		- Most tech evolves a lot, especially language
	- Nothing is better for a new technology than for it to be used for a few years solely by a small number of early adopters
		- Early adopters are sophisticated and demanding, quickly flushing out any flaws remaining in your tech
		- With few users you can be in close contact with all of them
		- Early adopters are forgiving when you improve your system even if it causes some breakage
	- 2 ways for new technology to get launched: organic growth or big-bang method
		- Organic growth: under-funded, stealthy, no marketing, few early users
			- Keep improving tech wile word of mouth grows user base
		- Big-bang: VC-backed, heavily marketed, rushed, immediate large user base
	- Organic growth yields better tech and richer founders than big-bang method
		- Most dominant tech grows organically

*
*
*Redesign*

	- The best writing is rewriting
		- The most important part of design is redesign
	- To write good software you must keep simultaneously two opposing ideas in your head:
		- The young hacker’s naïve faith in his ability
		- The veteran’s skepticism
		- No actual contradiction
			- You have to be optimistic about the possibility of solving the problem but skeptical about the value of whatever solution you’ve gotten so far
	- People who do good work often think that whatever they’re working on is no good
		- Others see what they’ve done and are full of wonder but the creator is full of worry
			- Worry makes the work good
			- Keep hope and worry balanced and the project will move forward
				- Anything you can do to keep the redesign cycle going is good
	- Software as a rule doesn’t get redesigned enough
	- Users can be helpful in improving your language but can also deter you from improving it
		- Choose your users carefully and be slow to grow their number
		- Having users is like optimization in that the wise course is to delay it
	- As a general rule, you can get away with changing more than you think
		- Introducing change is like pulling off a bandage: the pain is a memory almost as soon as you feel it
	- Committees yield bad design
		- Also interfere with redesign
			- So much work to implement changes, no one wants to bother doing it
			- What a committee decides tends to stay that way even if most of the members don’t like it
		- Even 2 person committees get in the way of redesign
			- Happens frequently in interfaces between pieces of software written by two different people
			- To change the interface both have to agree to change it at once
				- Interfaces rarely change at all
					- Problematic because they’re usually most ad hoc parts of any system

*The Dream Language*
	- Beautiful, clean, terse
	- Interactive top-level that starts up fast
	- You can write programs to solve common problems with very little code
	- Nearly all the code in any program you write is code that’s specific to your application
		- Everything else is done for you
	- The syntax is brief to a fault
		- No unnecessary characters or prolific use of the shift key
	- Using big abstractions you can write the first version of a program very quickly
	- When you want to optimize, there’s a really good profiler that tells you where to focus your attention
	- You can make inner loops blindingly fast even writing inline byte code if you need to
	- Lots of examples to learn from
	- Intuitive enough to learn from example in few minutes
	- Small core with powerful highly-orthogonal libraries carefully designed as the core language
	- The libraries all work well together
	- Nothing is depreciated or retained for compatibility
	- Source code of all libraries is readily available
	- Easy to talk to the operating system and to applications written in other languages
	- Language is built in layers
		- Higher-level abstractions built very transparent out of lower-level ones which you can get a hold of
	- Nothing is hidden from you that doesn’t absolutely have to be
	- Encourages you to be an equal participant in its design
	- You can change everything about it

