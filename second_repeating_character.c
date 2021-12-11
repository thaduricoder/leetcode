//c program to find the second non-repeating character in a string
#include <stdio.h>
#define NO_OF_CHARS 256
char getSecondMostFreq(char *str)
{
    int count[NO_OF_CHARS] = {0}, i;
    for (i=0; str[i]; i++)
        (count[str[i]])++;
    int first = 0, second = 0;
    for (i = 0; i < NO_OF_CHARS; i++)
    {
        if (count[i] > count[first])
        {
            second = first;
            first = i;
        }       
        else if (count[i] > count[second] && count[i] != count[first])
            second = i;
    }
    return second;
} 
int main()
{
  char str[1000];
  printf("Enter the string : ");
  scanf("%s",str);
  char res = getSecondMostFreq(str);
  if (res != '\0')
     printf("%c", res);
  else
     printf("Invalid String");
  return 0;
}
