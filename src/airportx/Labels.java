package airportx;

class Labels {
  String anuounce;

  Labels() {
    this.anuounce = "Anuounce here";
  }

  String getAnuounce() {
    return this.anuounce;
  }

  void setAnuounce(String nuevoAnuounce) {
    this.anuounce = nuevoAnuounce;
  }

  public String toString() {
    return this.getAnuounce();
  }
}
