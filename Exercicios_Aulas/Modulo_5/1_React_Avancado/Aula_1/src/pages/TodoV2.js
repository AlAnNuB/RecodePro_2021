import {useState} from 'react'

// Utilização de function e hook useState

function TodoList (props) {
    return (
        <ul>
          {props.items.map(item => (
            <li key={item.id}>{item.text}</li>
          ))}
        </ul>
    );
}

function TodoV2 () {
   
    const [items, setItems] = useState([]);
    const [text, setText] = useState('');
    
    function handleChange(e) {
        setText(e.target.value);
    }

    function handleSubmit(e) {
        e.preventDefault();
        if (text.length === 0) {
          return;
        }
        const newItem = {
          text: text,
          id: Date.now()
        };
        setItems(items.concat(newItem));
        setText('');
    }
    
    return (
      <div>
        <h3>Tarefas V2</h3>
        <TodoList items={items} />
        <form onSubmit={handleSubmit}>
          <label htmlFor="new-todo">
            O que precisa ser feito?
          </label>
          <input
            id="new-todo"
            onChange={handleChange}
            value={text}
          />
          <button>
            Adicionar #{items.length + 1}
          </button>
        </form>
      </div>
    );
}

export default TodoV2;
