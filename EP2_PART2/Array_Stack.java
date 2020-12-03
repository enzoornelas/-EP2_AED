public class Array_Stack {

  protected int array[];
  private int count;
  private int sizeofarray;

public Array_Stack() {
array = new int[1];
count = 0;
sizeofarray = 1;
}

public void addElement(int a)
{

if (count == sizeofarray)
{
growSize();
}

array[count] = a;
count++;
}

public void growSize()
{

int temp[] = null;
if (count == sizeofarray)
{

temp = new int[sizeofarray * 2];
{
for (int i = 0; i < sizeofarray; i++)
{

temp[i] = array[i];
}
}
}
array = temp;
sizeofarray= sizeofarray * 2;
}


}
