class Can
{
 private String content;
 private boolean full;

 public Can(String cont)
 {
  content = cont;
  full = true;
 }

 public String toString()
 {
  if(full)
    return "a can of "+content;
  else
    return "an empty can";
 }

 public boolean isFull()
 {
  return full;
 }

 public void drink()
 {
  if(full)
     full=false;
  else
     throw new EmptyCanException();
 }
}
