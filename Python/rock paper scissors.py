import random

user_action = input("please select (Rock, Paper, Scissors): ")
possible_choices = ["Rock", "Paper", "Scissors"]
computer_response = random.choice(possible_choices)

#prints user and computer actions
print(f"\nyou chose {user_action}, computer chose {computer_response}. \n")

if user_action == computer_response:
    print (f"Player and Computer chose {user_action}. Tie!")
elif user_action == "Rock":
    if computer_response == "Scissors":
        print("Rock wins")
    else:
        print("Paper beats Rock")
elif user_action == "Paper":
    if computer_response == "Scissors":
        print("Scissors wins")
    else:
        print("Rock beats Scissors")
elif user_action == "Paper":
    if computer_response == "rock":
        print("Paper wins")
    else:
        print("Scissors beats Paper")