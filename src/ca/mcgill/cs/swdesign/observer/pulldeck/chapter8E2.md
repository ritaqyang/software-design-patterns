Apply observer design pattern to make the class observable 

Assume we have two concrete observers

1. DrawLogger: prints any card that is drawn 
2. SizeStatus: prints out the size of the deck whenever it changes 

Use the pull data-flow strategy instead of push (exercise1)

The concrete observers can be implemented as simple println statements 

use the interface segregation principle to strengthen the constraint 
that observers should not change the state of the deck object