public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int startingCapacity){
    data = new String[startingCapacity];
  }

  public void clear(){
    data = new String[10];
  }

  public int size(){
    int count = 0;

    for (int i = 0 ; i < data.length ; i++) {
      if (data[i] != null) {
        count++;
      }
    }
    return count;
  }

  public boolean isEmpty(){
    if (size() == 0) {
      return true;
    }
    return false;
  }

  public boolean add(String value){
    if (size() < data.length) {
      data[size()] = value;
      return true;
    }
    else {
      resize();
      return add(value);
    }
  }

  public String get(int index){
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("choose a valid index");
    else
      return data[index];
  }

  public String set(int index, String value){
    String old;
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("choose a valid index");
    else{
      old = data[index];
      data[index] = value;
    }
    return old;
  }

  private void resize(){
    String[] temp = new String[size()];
    for (int i = 0 ; i < data.length ; i++){
      temp[i] = data[i];
    }
    data = new String[2 * size() + 1];
    for (int i = 0 ; i < temp.length ; i++){
      data[i] = temp[i];
    }
  }

  public boolean contains(String target){
    for (int i = 0 ; i < size() ; i++){
      if (data[i].equals(target)){
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target){
    for (int i = 0 ; i < size() ; i++){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = size() - 1 ; i > -1 ; i--){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String value){
    String[] temp = new String[2 * data.length];
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("please choose a valid index");
    }
    else{
      for (int i = 0 ; i < index ; i++){
        temp[i] = data[i];
      }
      temp[index] = value;
      for (int i = index ; i < data.length ; i++){
        temp[i + 1] = data[i];
      }
      data = temp;
    }
  }

  public String remove(int index){
    String[] temp = new String[2 * data.length];
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("please choose a valid index");
    }
    else {
      for (int i = 0 ; i < index ; i++){
        temp[i] = data[i];
      }
      String target = data[index];
      for (int i = index + 1 ; i < size() ; i++){
        temp[i - 1] = data[i];
      }
      data = temp;
      return target;
    }
  }

  public String toString(){
    String answer = "[" + data[0];
    for (int i = 1 ; i < size() ; i++){
      answer += ", " + data[i];
    }
    answer += "]";
    return answer;
  }

  public String toStringDebug(){
    String answer = "[" + data[0];
    for (int i = 1 ; i < data.length ; i++){
      answer += ", " + data[i];
    }
    answer += "]";
    return answer;
  }

  public boolean remove(String value){
    String[] temp = new String[2 * data.length];
    boolean notRemoved = true;
    for (int i = 0 ; i < size() ; i++){
      if (data[i].equals(value) && notRemoved){
        i++;
        notRemoved = false;
      }
      if (notRemoved){
        temp[i] = data[i];
      }
      else{
        temp[i - 1] = data[i];
      }
    }
    data = temp;
    if (notRemoved){
      return false;
    }
    else{
      return true;
    }
  }


}
