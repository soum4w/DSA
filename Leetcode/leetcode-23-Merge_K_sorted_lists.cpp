//Divide and conquer
//we can solve it using priority queue also with the same TC but this approach is slightly better

#include <bits/stdc++.h>
using namespace std;
struct ListNode{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution
{
public:
    ListNode* merge2Lists(ListNode* list1, ListNode* list2)
    {
        if (list1 == nullptr || list2 == nullptr)
            return list2 == nullptr ? list1 : list2;

        if (list1->val <= list2->val)
        {
            list1->next = merge2Lists(list1->next, list2);
            return list1;
        }
        else
        {
            list2->next = merge2Lists(list2->next, list1);
            return list2;
        }
    }

    ListNode *partitionAndMerge(int start, int end, vector<ListNode *> &lists)
    {
        if (start > end)
            return NULL;
        if (start == end)
            return lists[start];

        int mid = start + (end - start) / 2;
        ListNode* list1 = partitionAndMerge(start, mid, lists);
        ListNode* list2 = partitionAndMerge(mid + 1, end, lists);
        return merge2Lists(list1, list2);
    }

    ListNode *mergeKLists(vector<ListNode *> &lists)
    {
        int size = lists.size();
        if (size == 0)
            return nullptr;
        return partitionAndMerge(0, size - 1, lists);
    }
};

