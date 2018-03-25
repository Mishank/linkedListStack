try{
    print("begin");
    const linkedListImport = Java.type("LinkedList");
    const linkedListStackImport = Java.type("linkedListStack");

    let linkedListStack = new linkedListStackImport();
    linkedListStack.push(1);
    linkedListStack.push(2);
    linkedListStack.push(3);
    print(`ES6 enable: ${linkedListStack.toString()}`);
} catch(e){
    print("error");
    throw new Error(e)
} finally {
    print("end");
}

// Java\jdk-9.0.1\bin\jjs.exe --language=es6 C:\Users\Administrator\IdeaProjects\linkedListStack\src\main.js -cp C:\Users\Administrator\IdeaProjects\linkedListStack\out\artifacts\linkedListStack_jar\linkedListStack.jar