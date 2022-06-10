import { useContext } from "react"
import { ContadorContext } from "../../context/Contador"

const Mirror = () => {

    const { count } = useContext(ContadorContext)

    return (
        <>
            <h1>Mirror: {count}</h1>
        </>
    )
}

export default Mirror