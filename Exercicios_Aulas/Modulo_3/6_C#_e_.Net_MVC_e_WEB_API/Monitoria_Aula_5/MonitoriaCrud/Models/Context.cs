using Microsoft.EntityFrameworkCore;

namespace MonitoriaCrud.Models
{
    public class Context : DbContext
    {
        public Context(DbContextOptions<Context> options) : base(options)
        {
            
        }
        public DbSet<Pessoa> pessoas { get; set; }
    }
}