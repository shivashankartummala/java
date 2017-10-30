A online fruit store decides to give the below offer to its customers.
everyday there is a secret combination of fruits , if any customer happens buy in the same combination then he is chosen to be the winner.
To manage the secret codes the codes are oganised into a list of list of fruit names in which the order of the items in a group 
and the order of the groups itself should match the items in the shopping cart to pick a customer as winner. There can be any number of any fruits interleaved inbetween the groups. And the keyword 'anything' is part of a list then it can allow an fruit but limited to only one item.

Write a method to that takes List<List <String>> codeList, List<String> ShoopingCart as input retuns 0 or 1 

codeList=[[apple, apple][orange,anything,orange]]
shopingcart1=[banana,apple,apple,grapes,orange,watermelon,orange]  ---> retrun 1
shoppingcart2=[banana,orange,banana,orange,apple,apple] --------> return 0

CodeList=[[orange][watermelon,apple][banana,anything,banana]
shoppingcart1=[banana,orange,banana,watermelon,apple,orange,banana,apple,banana] ---> return 1
shoppingcart2=[banana,orange,banana,watermelon,banana,orange,banana,apple,banana] --- return 0
