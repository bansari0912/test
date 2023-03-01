import re
def is_valid_java_identifier(s):
    pattern = r'^[a-zA-Z_$][a-zA-Z0-9_$]*$'
    return re.match(pattern, s) is not None
   
print(is_valid_java_identifier('Hello_World')) 
print(is_valid_java_identifier('123_hel'))     
print(is_valid_java_identifier('public'))
print(is_valid_java_identifier('122'))
