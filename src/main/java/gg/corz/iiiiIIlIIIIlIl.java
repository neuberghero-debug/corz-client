package gg.corz;

public record iiiiIIlIIIIlIl(int dx, int dz, long ledge, long feet, boolean needsLedge, int freeRun, int work, int faced, IIiilIlllIiilIll reject) {
   private final int IiIiiiiIlliIiiiiIl;
   private final int iIIiiiiIlIlIiiiiIl;
   private final boolean IIIiiiiIllIIiiiiIl;
   private final int lIiliiiIliIiliiiIl;
   private final IIiilIlllIiilIll iiIiiiiIlIIliiiiIl;
   private final int IliliiiIllliliiiIl;
   private final int llIiiiiIlilIiiiiIl;
   private final long ililiiiIlIiiliiiIl;
   private final long liiliiiIliiiliiiIl;

   public int lIiiIiIlilli() {
      return this.IliliiiIllliliiiIl;
   }

   public int IIlllIlliIll() {
      return this.llIiiiiIlilIiiiiIl;
   }

   public iiiiIIlIIIIlIl(int dx, int dz, long ledge, long feet, boolean needsLedge, int freeRun, int work, int faced, IIiilIlllIiilIll reject) {
      this.lIiliiiIliIiliiiIl = dx;
      this.IliliiiIllliliiiIl = dz;
      this.ililiiiIlIiiliiiIl = ledge;
      this.liiliiiIliiiliiiIl = feet;
      this.IIIiiiiIllIIiiiiIl = needsLedge;
      this.iIIiiiiIlIlIiiiiIl = freeRun;
      this.llIiiiiIlilIiiiiIl = work;
      this.IiIiiiiIlliIiiiiIl = faced;
      this.iiIiiiiIlIIliiiiIl = reject;
   }

   public int iIlIlllllill() {
      return llIiIiililIiIiil.Illlllllilll(this.liiliiiIliiiliiiIl);
   }

   public boolean IliIlllilIi() {
      return this.iiIiiiiIlIIliiiiIl == null;
   }

   public boolean IlIlllIlilIl() {
      return this.IIIiiiiIllIIiiiiIl;
   }

   public int Illlllllilll() {
      return this.IiIiiiiIlliIiiiiIl;
   }

   public int IiIlliIliiIl() {
      return this.iIIiiiiIlIlIiiiiIl;
   }

   public int liiiIIllIl() {
      return llIiIiililIiIiil.IiIlliIliiIl(this.liiliiiIliiiliiiIl);
   }

   public long iliIiiliiiii() {
      return this.ililiiiIlIiiliiiIl;
   }

   public int IilliliilIIi() {
      return this.lIiliiiIliIiliiiIl;
   }

   public IIiilIlllIiilIll Iilllilliill() {
      return this.iiIiiiiIlIIliiiiIl;
   }

   public long IIIllIIliIIl() {
      return this.liiliiiIliiiliiiIl;
   }
}
