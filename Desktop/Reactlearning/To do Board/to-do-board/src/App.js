import { useState } from "react";

const Input = () => {
  const [input, setInput] = useState("");
  const [taskList, setTaskList] = useState([]);

  const handleAddTask = (e) => {
    e.preventDefault();
    if (input.trim()) {
      setTaskList((prevTaskList) => [...prevTaskList, input]);
      setInput(""); // Clear the input field after adding a task
    }
  };

  return (
    <div className="flex flex-col items-center justify-center py-8 gap-4">
      <h1 className="text-xl font-semibold">To - Do - Board</h1>
      <form onSubmit={handleAddTask} className="flex flex-col items-center">
        <input
          className="border rounded px-2 mb-2"
          type="text"
          placeholder="Add a task"
          value={input}
          onChange={(e) => setInput(e.target.value)}
        />
        <button 
        className="bg-violet-400 text-black py-1 px-3.5 rounded-lg font-semibold hover:opacity-70"
        onClick={handleAddTask}
        >
            Add</button>
      </form>
      <ul className="mt-4">
        {taskList.map((task, index) => (
          <li key={index} className="list-disc">
            {task}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Input;
