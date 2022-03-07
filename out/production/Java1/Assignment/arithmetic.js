let x=1
let y=2

sum=x+y

function  cookFood(){
    return function (food){
        return food
        console.log(food)
    }


const  testBeans = cookFood()
console.log(testBeans("beans"))


const  returnFunction=(aFunction)=>{
    return aFunction
}

const yetAnotherFunction=returnFunction(()=> console.log("greet"))


    yetAnotherFunction()

}


const toggleLight =(event, callMeBack) =>{
    switch (event){
        case "walkedIn":
            callMeBack("Switch On")
            break;
        case  "walkedOut":
            callMeBack("switch off")
            break;
        default:
            console.log("lights off")
            break
    }
}

toggleLight("walkedIn", (data) => console.log("lights are " + data))
toggleLight("walkedOut", (data) => console.log("lights are " + (data)))
toggleLight("walkedOnWater", (data) => console.log("lights are " +data))

