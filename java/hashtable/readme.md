# Hashtables
A hash is the result of some algorithm taking an incoming string and converting it into a value that could be used for either security or some other purpose. In the case of a hashtable, it is used to determine the index of the array.

## Challenge
 ### set
- Arguments: key, value
- Returns: nothing
- This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
Should a given key already exist, replace its value from the value argument given to this method.
 ### get

- Arguments: key
- Returns: Value associated with that key in the table

 ### contains
- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.
### keys
- Returns: Collection of keys
- hash
- Arguments: key
- Returns: Index in the collection for that key

## Approach & Efficiency


- set  Big O  is O(1)  for space and   O(n) for time.

- get:  Big O  is O(1) for space and  O(n)  for time.

- contains:  Big O  is O(1) for space and  O(n)  for time.
- hash    Big O  for   space  and  time O(1).
keys:  Big O  is O(n) for space and  O(1)  for time.
## API
### set
- Arguments: key, value
- Returns: nothing
- This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
  Should a given key already exist, replace its value from the value argument given to this method.
### get

- Arguments: key
- Returns: Value associated with that key in the table

### contains
- Arguments: key
- Returns: Boolean, indicating if the key exists in the table already.
### keys
- Returns: Collection of keys
- hash
- Arguments: key
- Returns: Index in the collection for that key