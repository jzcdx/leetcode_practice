class SmallestInfiniteSet(object):
    def __init__(self):
        self.smallest = 1;
        self.everything_else = set()

    def popSmallest(self):
        """
        :rtype: int
        """
        ret_me = self.smallest;
        self.everything_else.add(ret_me)
        
        while self.smallest in self.everything_else:
            self.smallest += 1; 
        return ret_me

    def addBack(self, num):
        """
        :type num: int
        :rtype: None
        """
        if num < self.smallest:
            self.smallest = num
        if num in self.everything_else:
            self.everything_else.remove(num)