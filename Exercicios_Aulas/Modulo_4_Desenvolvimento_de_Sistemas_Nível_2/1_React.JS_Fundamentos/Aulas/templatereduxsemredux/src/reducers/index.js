import { clickReducer } from './clickReducer'; 
// Caso tenha outros reducers incluir a importação aqui
import { combineReducers } from 'redux'; 

  

export const Reducers = combineReducers({ 

  clickState: clickReducer 

});