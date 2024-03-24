import random
import string

# Function to generate a random password
def generate_password(length):
    # Define the character sets for the password
    lowercase_letters = string.ascii_lowercase
    uppercase_letters = string.ascii_uppercase
    digits = string.digits
    special_characters = '!@#$%^&*()_+-=[]{}|;:,.<>?'

    # Combine character sets based on complexity
    if length < 8:
        character_set = lowercase_letters + uppercase_letters + digits
    else:
        character_set = lowercase_letters + uppercase_letters + digits + special_characters

    # Generate the password by randomly selecting characters
    password = ''.join(random.choice(character_set) for _ in range(length))
    return password

# Main program
if __name__ == "__main__":
    try:
        length = int(input("Enter the desired length of the password: "))
        if length <= 0:
            print("Invalid input. Password length must be a positive integer.")
        else:
            password = generate_password(length)
            print("Generated Password: " + password)
    except ValueError:
        print("Invalid input. Please enter a valid positive integer for password length.")