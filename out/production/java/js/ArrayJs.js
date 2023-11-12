class ArrayJs {
  constructor() {
    this.data = {};
    this.length = 0;
  }

  get(index) {
    return this.data[index];
  }

  push(item) {
    this.data[this.length] = item;
    this.length++;
  }

  pop(item){
    delete this.data[this.length-1];
    this.length--;
  }

  delete(index){
  delete this.data[index];
  this.length--;
  }
}

const newArr = new ArrayJs();
// newArr = {'hi'};
newArr.push('hi');
newArr.pop('hi');
console.log(newArr);
