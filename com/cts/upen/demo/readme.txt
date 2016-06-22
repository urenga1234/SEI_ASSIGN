
DeDuplicatorUtil is a utility class that provides deduplication of int arrays

it provides three methods 

1. deDuplicate(int[] input) 

this is a default deduplicator that uses hashset to eliminate duplicates
positives : simple solution ; leverages existing api

negetive: not thread safe; it only accepts int[] 

workaround: we can syncronise the method and we can accept a object array and override the hashcode()

2. stableDeDuplicator(int[] input)

this provides stable duplicate elimination by using LinkedHashSet

positives: gaurenties input ordering ; leverages existing api

negetive: not thread safe; it only accepts int[] 

workaround: we can syncronise the method and we can accept a object array and override the hashcode()

3. customDeDuplicator

this provides custom duplicate elimination by using Accepting IDeDuplicator in input

positives: extensible

negetive:not thread safe

workaround: we can syncronise the method



please run DeduplicatorDemo.java for a demo



