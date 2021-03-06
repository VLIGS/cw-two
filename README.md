# cw-two

Aedemar McFarlane – GitHub account:  BBK-PiJ-2014-38,   Liudmila Veshneva - GitHub account: VLIGS

A program to play a text based version of the board game Mastermind

HOW TO RUN

* Run via MastermindDriver


SPRING FRAMEWORK CONFIGURATIONS:

* Set scope="prototype" (Spring container creates new bean instance of the object every time a request for bean is made)
for Peg, Line and PegColour because these are state-full beans, rest of them are stateless and therefore let scope
default to singleton.

* Bean.xml file is used for configuration rather than JavaConfig despite consensus that xml is inferior method. In context of this
coursework all the disadvantages of using xml file for configuration are not applicable. For instance, xml configuration method
is often criticised for having long and unmanagable configuration, which is not the case for this case due to small scale.

* Used autowiring for majority of classes that have constructors with no parameters, GameImpl instantiates most of the dependencies
via autowiring, but for classes that have interactive or dynamic constructors, used dependency injection via setter method.

* Feedback class (used to generate feedback to player) has static fields and is instantiated via constructor

FLEXIBILITY

* As specified in requirements, following aspects of the Mastermind game can be configured via bean xml:
        - number of pegs (configured in "numberofpegs" bean by changing value of "numberOfPeg" property)
        - peg colours (configured in "pegcolour" bean by changing values of "colours" property implemented as list
        - number of tries (configured in "numberofguesses" bean by changing value of "numberOfGuesses" property)

* The feedback that is displayed to player can be configured in bean xml. For example three mutually exclusive
 outcomes: ExactMatch, Match and NoMatch currently configured to be indicated by "Black", "White", and "No Pegs" respectively
 can be configured to "ExactMatch", "Match", "NoMatch" if preferred. This can be achieved by changing values of constructor-arg
 of "feedback" bean.

* All of the implementations of beans can be reconfigured in bean file.


FUNCTIONAL PROGRAMMING

* Utilised streams, combined with map, λ and collect where appropriate, for example in isValidGuess method
of ErrorCheckerImpl class.

ASSUMPTIONS

* Have assumed that any changes made by a new programmer to the peg colours will be made intelligently; that is
  there will be no colours with the same first letters like Purple and Pink and that actual colours will be used
  as strings and not any string, like Post, Perfect etc. .
  This assumption has been made relying in the following from the assignment brief:
  "Part of the assignment grade will be determined by .....how easily different colours could be added, ASSUMING
  they start with a different letter than other existing colours"

TESTING

* Two different implementations of RandomGenerator: RandomGeneratorImpl and NotSoRandomGenerator have been added to the
  project to demonstrate (i) the ease of interchanging implementing classes in the bean file. NotSoRandomGenerator was
  used to test this but RandomGeneratorImpl should be used and has been used in the final config file to achieve the
  correct results.

