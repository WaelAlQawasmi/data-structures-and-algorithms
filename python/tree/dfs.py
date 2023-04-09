def pre_order(head):
    if head:
        print(head.val)
        pre_order(head.left)
        pre_order(head.right)
def in_order(head):
    if head:
        print(head.val)
        pre_order(head.left)
        pre_order(head.right)


