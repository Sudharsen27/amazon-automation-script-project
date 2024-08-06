import { useState } from "react";

const Input = ({taskList , setTaskList}) => {
  const [input, setInput] = useState("");

  const handleAddTask = (e) => {
    e.preventDefault();
    setTaskList([...setTaskList, input]);
    setInput("");
    // Additional logic to add a task can be placed here
  };

  return (
    <>
      <form className="flex flex-row items-center gap-4">
        <input
          className="border rounded-lg py-1.5 px-2.5 text-lg"
          type="text"
          placeholder="Add a task"
          value={input}
          onChange={(e) => setInput(e.target.value)}
        />
        {/* <button 
        className="bg-violet-400 text-white py-2 px-3.5 rounded-lg"
        onClick={handleAddTask}
        >
            Add</button> */}
      </form>
    </>
  );
};

export default Input;
