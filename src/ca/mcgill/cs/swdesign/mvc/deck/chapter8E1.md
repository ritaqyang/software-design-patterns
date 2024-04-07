Apply observer design pattern to make the class observable 

Assume we have two concrete observers

1. DrawLogger: prints any card that is drawn 
2. SizeStatus: prints out the size of the deck whenever it changes 

Use the push data-flow strategy 

The concrete observers can be implemented as simple println statements 