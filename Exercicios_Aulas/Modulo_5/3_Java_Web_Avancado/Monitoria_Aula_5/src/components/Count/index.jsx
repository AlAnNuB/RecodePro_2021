import { useContext } from "react"
import { ContadorContext } from "../../context/Contador"


const Count = () => {

    const { count, setCount } = useContext(ContadorContext)

    return (
        <>
            <h1>Count: {count} </h1>
            <button onClick={() => setCount(count + 1)}>Set</button>
        </>
    )
}

export default Count