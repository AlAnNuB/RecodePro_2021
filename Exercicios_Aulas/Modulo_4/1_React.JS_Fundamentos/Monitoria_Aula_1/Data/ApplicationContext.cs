using Microsoft.EntityFrameworkCore;

namespace MonitoriaWEBAPI.Data
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Cliente> Clientes { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Server = localhost; Database = MonitoriaWEBAPI; User Id = SA; Password = @Alan74568492");
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Cliente>(table => {
                table.ToTable("Clientes");
                table.Property("Nome").HasMaxLength(40);
                table.Property("CPF").HasColumnType("CHAR(11)");
                table.Property("Nascimento").HasColumnType("DATE");
                table.HasKey("Id");
            });


        }
    }
}