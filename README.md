# Zodiac-Converter

Chinese Zodiac (30 pts) – ChineseZodiac.java
Traveling Song (30 pts) – TravelingSong.java
Extra credit: Gem Fusion (20 pts) – Fusion.java
Please make sure to include your pledge in each code
The deadline for this code is Feb. 19 11:59 pm
 

Chinese Zodiac

Write a program that asks the user to enter a year. The program should then indicate the type of year it is based on the Chinese Zodiac.

 The order of the Chinese Zodiac shown below is based on a 12-year cycle. The first zodiac corresponds to years divisible by 12 (remainder 0), the second year corresponds to years that a produce a remainder of 1 and so on. For instance, 2017 is the year of the rooster because 2017 divided by 12 produces a remainder of 1.

Monkey

Rooster

Dog

Pig

Rat

Ox

Tiger

Rabbit

Dragon

Snake

Horse

Sheep

 

You will need:

A scanner object for input
A variable to store the year entered
A switch statement to select the appropriate zodiac sign
Comments for appropriate documentation
A sample of the output is shown below:

Enter a year: 1979
The year 1979 is the year of the sheep

 

Bottles of Beer on the wall

Write a program that prints the first few verses of the traveling song “One Hundred Bottles of Beer.” Use a loop such that each iteration prints one verse. Read the number of verses to print from the user. Validate the input. The following are the first two verses of the song:

100 bottles of beer on the wall

100 bottles of beer

If one of those bottles should happen to fall

99 bottles of beer on the wall

 

99 bottles of beer on the wall

99 bottles of beer

If one of those bottles should happen to fall

98 bottles of beer on the wall

 

You will need:

A scanner object for input
A variable to store the number of verses
Two loops:
One to perform input validation
The other to adjust the verses for each iteration
Comments for appropriate documentation
 

A sample of the output is shown below: 

How many verses (1 to 100)? -3
How many verses (1 to 100)? 3

100 bottles of beer on the wall.
100 bottles of beer.
If one of those bottles should happen to fall
99 bottles of beer on the wall.

99 bottles of beer on the wall.
99 bottles of beer.
If one of those bottles should happen to fall
98 bottles of beer on the wall.

98 bottles of beer on the wall.
98 bottles of beer.
If one of those bottles should happen to fall
97 bottles of beer on the wall.

 

Extra Credit: Gem Fusion

Write a program that simulates the gem fusions that occur in the TV show “Steven Universe.”

According to the show, the following fusions occurred between the good gems and/or humans:

Garnet + Pearl = Sardonyx

Garnet + Amethyst = Sugilite

Pearl + Amethyst = Opal

Steven + Amethyst = Smoky Quartz

Connie + Steven = Stevonnie

With this information, write a program that asks the users for the names of two gems/humans and outputs the fusion that they create. If the user enters a combination other than the ones entered, report that there is “No known fusion.”

Note: The user should be able to enter the names in any order to get the result. So the user should be able to enter Pearl, then Garnet and get the same result as Garnet, then Pearl.

You will need:

A scanner object for input
Variables to store the two gems
A nested if-else statement to output the appropriate fusion
Use logical operators to ensure that the correct fusion is obtained for any order
Use the equalsIgnoreCase method to ensure that the code recognizes the gem’s name regardless of the case entered.
Comments for appropriate documentation
 

A sample of the output is shown below:

Who is the first gem? Amethyst
Who is the second gem? Pearl

When Amethyst and Pearl fuse, they create Opal.

Submission
 Submitted!
Feb 14, 2017 at 9:23pm
Submission Details
Download 13-2-1017.zip
Grade: 79 (60 pts possible)
Graded Anonymously: no
Comments:
for zodiac.java case 0: System.out.println("The year " + years + " is the year of the mondey"); should be monkey
