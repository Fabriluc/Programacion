console.log("hola");

async function getUsuarios(){
try {
    const request = await fetch('http://localhost:8080/users', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
    });
    if(!request.ok){
        throw new Error(`fetch error${request.status}`);
    }
    const usuarios = await request.json();
    console.log(usuarios);

    const tableHtml = usuarios.map((usuarios) => {
            return`
            <tr>
              <td>${usuarios.id}</td>
              <td>${usuarios.nombre}</td>
              <td>${usuarios.telefono}</td>
              <td>${usuarios.mail}</td>
              <td>
                <button class="btn btn-danger btn-circle btn-sm" onclick="deleteUser(${
                  usuarios.id
                })"><i class="fas fa-trash"></i></button>
              </td>
            </tr>
          `;
          })
          .join("");

        document.getElementById("userTableBody").innerHTML = tableHtml;
    return usuarios;

}catch (error) {
    console.error("nooo man la re bardeaste", error);
}
}
getUsuarios();

