shop_menus = ["만두", "떡볶이", "오뎅", "사이다", "콜라"]
shop_orders = ["오뎅", "콜라", "만두"]


def is_available_to_order(menus, orders):
    menus.sort()
    for order in orders:
        min_i = 0
        max_i = len(menus) - 1
        while min_i <= max_i:
            compare_i = (max_i + min_i) // 2
            if order > menus[compare_i]:
                min_i = compare_i+1
            elif order < menus[compare_i]:
                max_i = compare_i-1
            else:

    return False


result = is_available_to_order(shop_menus, shop_orders)
print(result)