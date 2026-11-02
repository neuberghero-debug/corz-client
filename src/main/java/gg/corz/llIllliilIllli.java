package gg.corz;

public record llIllliilIllli(IIiIlIilIiIlIi ticket, String why) {
   private final IIiIlIilIiIlIi ilililIIIl;
   private final String IiililIIIl;

   public String iIlIlllllill() {
      return this.IiililIIIl;
   }

   public llIllliilIllli(IIiIlIilIiIlIi ticket, String why) {
      this.ilililIIIl = ticket;
      this.IiililIIIl = why;
   }

   public IIiIlIilIiIlIi liiiIIllIl() {
      return this.ilililIIIl;
   }

   public String IliIlllilIi() {
      return this.ilililIIIl.lIiiIiIlilli()
         + IilliliilIIi<"IilliliilIIi","0b+48/9zq//2qijKNYBiTmDKg8TZHExMjHRo1a0=">()
         + this.ilililIIIl.iliIiiliiiii()
         + IilliliilIIi<"IilliliilIIi","Y3CeSXxf7FM6W8jGXAKpjEFA1NS5YK0Gfv+lDCea">()
         + this.IiililIIIl;
   }
}
