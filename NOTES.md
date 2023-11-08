Finished reading : 8:06pm UTC+2 GO

Initial idea
1. This cannot be solved with a greedy approach, as we may always choose the smallest available
        and this may lead us to not the optimal one

```
7
6 3 <- if we choose 3, we lost the proper solution
3 8 5
11 2 10 9
```
2. we know only at the end, therefore we need to add all weights up to the given point and choose the smallest one from the end!
```
      7
    13  10
16 (21,18) 15
27 (18,20) ... ...
```
on doubles, we keep the smallest, then we select from the leaf'es the smallest one
and traverse back the tree,

8:17pm start coding (i think it will work)