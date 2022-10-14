from typing import List

from django.http import HttpResponse
from django.shortcuts import render

category_list = ["Dell", "Huawei", "Apple", "Asus", "Monster"]
price_list = ["0-5.000 TL", "5.000-7.000 TL", "7.000-9.000 TL", "9.000-12.000 TL", "12.000 TL üstü"]
computer_list = [
    {
        "computer_name":"computer1",
        "description":"computer1 description",
        "image":"https://img-monsternotebook.mncdn.com/UPLOAD/urun-gorselleri-yeni/ABRA/A7-V13-1/thumb/Abra_A7_v13__-_NH-79_TR_-_rtx3050_medium.png"
    },

    {
        "computer_name": "computer2",
        "description": "computer2 description",
        "image": "https://cdn.vatanbilgisayar.com/Upload/PRODUCT/lenovo/thumb/135097-1_large.jpg"
    },

    {
        "computer_name": "computer3",
        "description": "computer3 description",
        "image": "https://cdn.akakce.com/z/dell/dell-latitude-3420-n027l342014emea-w-i7-1165g7-8-gb-256-gb-ssd-14-w10p-fhd-dizustu-bilgisayar.jpg"
    }

]


def home(request):
    data = {
        "categories": category_list,
        "prices": price_list,
        "computers": computer_list
    }
    return render(request, "index.html", data)
