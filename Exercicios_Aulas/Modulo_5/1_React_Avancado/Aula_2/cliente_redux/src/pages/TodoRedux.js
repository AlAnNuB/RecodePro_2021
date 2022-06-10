import {useEffect, useState} from 'react'
import {listTodos, addTodo} from '../repo/actions';
import store from '../repo/store';
import {TodoList} from "./TodoList"

function TodoRedux () {
   
    const [items, setItems] = useState([]);
    const [text, setText] = useState('');
    const [conectado, setConectado] = useState(false);

    useEffect(()=>{
      if(!conectado){
        setConectado(true);
        store.subscribe(()=>{
          setItems(store.getState().todos);
        });
        store.dispatch(listTodos());
      }
    });
    
    function handleChange(e) {
        setText(e.target.value);
    }

    function handleSubmit(e) {
        e.preventDefault();
        if (text.length === 0) {
          return;
        }
        var chave=items.length+1;
        store.dispatch(addTodo(chave,text));
        setText('');
    }
    
    return (
      <div>
        <h3>Tarefas Redux</h3>
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

export default TodoRedux;
