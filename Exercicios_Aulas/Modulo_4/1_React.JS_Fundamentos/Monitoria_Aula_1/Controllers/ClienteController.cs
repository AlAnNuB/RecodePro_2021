using System;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using MonitoriaWEBAPI.Data;


namespace MonitoriaWEBAPI.Controllers
{
   [ApiController]
   [Route("Clientes")]

   public class ClienteController : ControllerBase
   {
       private ApplicationContext context;

       [HttpGet]
       public List<Cliente> ListarClientes()
       {
          context = new ApplicationContext();
          List<Cliente> clientes = context.Clientes.ToList();
          return clientes;
       }
   }
}