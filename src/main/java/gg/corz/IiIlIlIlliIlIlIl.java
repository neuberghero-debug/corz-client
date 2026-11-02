package gg.corz;

public record IiIlIlIlliIlIlIl(boolean loaded, boolean active, int total, int placed, int activeLayer, String section, int blocked) {
   private final boolean lIiIliilIl;
   private final int liiIliilIl;
   private final String IiiIliilIl;
   private final int IliIliilIl;
   private final boolean iIiIliilIl;
   private final int lliIliilIl;
   private final int iliIliilIl;

   public int liiiIIllIl() {
      return Math.round(this.IliIlllilIi() * 100.0F);
   }

   public boolean lIiiIiIlilli() {
      return this.iIiIliilIl;
   }

   public IiIlIlIlliIlIlIl(boolean loaded, boolean active, int total, int placed, int activeLayer, String section, int blocked) {
      this.lIiIliilIl = loaded;
      this.iIiIliilIl = active;
      this.IliIliilIl = total;
      this.lliIliilIl = placed;
      this.iliIliilIl = activeLayer;
      this.IiiIliilIl = section;
      this.liiIliilIl = blocked;
   }

   public int iliIiiliiiii() {
      return this.IliIliilIl;
   }

   public int IlIlllIlilIl() {
      return this.iliIliilIl;
   }

   public boolean iIlIlllllill() {
      return this.lIiIliilIl && this.iIiIliilIl && this.IliIliilIl > 0;
   }

   public boolean IilliliilIIi() {
      return this.lIiIliilIl;
   }

   public int IIlllIlliIll() {
      return this.liiIliilIl;
   }

   public int IIIllIIliIIl() {
      return this.lliIliilIl;
   }

   public String IiIlliIliiIl() {
      return this.IiiIliilIl;
   }

   public float IliIlllilIi() {
      return this.IliIliilIl <= 0 ? 0.0F : (float)this.lliIliilIl / (float)this.IliIliilIl;
   }
}
