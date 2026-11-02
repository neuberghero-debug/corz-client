package gg.corz;

public record lliIIliiliIIli(long stand, long component, IiIIiiilliIIiiil result, long geometryRevision, int repeats, String failureClass) {
   private final IiIIiiilliIIiiil Iiiiliiiiliiiliiii;
   private final long lliiliiiiiliiliiii;
   private final long iiiiliiiiIIIIiiiii;
   private final long iIiiliiiiIliiliiii;
   private final String IlIIiiiiillIIiiiii;
   private final int lIIIiiiiiiIIIiiiii;

   public String iliIiiliiiii() {
      return this.IlIIiiiiillIIiiiii;
   }

   public IiIIiiilliIIiiil iIlIlllllill() {
      return this.Iiiiliiiiliiiliiii;
   }

   public long IilliliilIIi() {
      return this.iiiiliiiiIIIIiiiii;
   }

   public int lIiiIiIlilli() {
      return this.lIIIiiiiiiIIIiiiii;
   }

   public lliIIliiliIIli(long stand, long component, IiIIiiilliIIiiil result, long geometryRevision, int repeats, String failureClass) {
      this.iIiiliiiiIliiliiii = stand;
      this.lliiliiiiiliiliiii = component;
      this.Iiiiliiiiliiiliiii = result;
      this.iiiiliiiiIIIIiiiii = geometryRevision;
      this.lIIIiiiiiiIIIiiiii = repeats;
      this.IlIIiiiiillIIiiiii = failureClass;
   }

   public long liiiIIllIl() {
      return this.lliiliiiiiliiliiii;
   }

   public long IliIlllilIi() {
      return this.iIiiliiiiIliiliiii;
   }
}
