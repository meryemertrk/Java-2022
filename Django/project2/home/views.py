from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def index(request):
    text = "Hello Django"
    return HttpResponse("You're looking at question %s." % text)

