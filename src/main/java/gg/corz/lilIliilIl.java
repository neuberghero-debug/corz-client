package gg.corz;

import java.util.List;

public record lilIliilIl(boolean executable, List<lIiIIiiIiIIi> steps, int failedIndex, IilIlIlililIlIli failure) {
   private final IilIlIlililIlIli IiIllIlliIllIl;
   private final List<lIiIIiiIiIIi> iIIllIlIlIllIl;
   private final boolean IIIllIllIIllIl;
   private final int llIllIlilIllIl;

   public List<lIiIIiiIiIIi> liiiIIllIl() {
      return this.iIIllIlIlIllIl;
   }

   public boolean IliIlllilIi() {
      return this.IIIllIllIIllIl;
   }

   public IilIlIlililIlIli IilliliilIIi() {
      return this.IiIllIlliIllIl;
   }

   public int iIlIlllllill() {
      return this.llIllIlilIllIl;
   }

   public lilIliilIl(boolean executable, List<lIiIIiiIiIIi> steps, int failedIndex, IilIlIlililIlIli failure) {
      this.IIIllIllIIllIl = executable;
      this.iIIllIlIlIllIl = steps;
      this.llIllIlilIllIl = failedIndex;
      this.IiIllIlliIllIl = failure;
   }
}
