package gg.corz;

import java.util.Locale;

public record lIliiIIliIliiIIl(
   long standCell,
   int expectedConfirms,
   double travelBlocks,
   int jumpTransitions,
   int verticalTransitions,
   int verticalReversals,
   int tempBlocks,
   int unclearedTemp
) {
   private final double lIliIlilIl;
   private final int llliIlilIl;
   private final int illiIlilIl;
   private final int IIliIlilIl;
   private final int iIliIlilIl;
   private final int IiliIlilIl;
   private final int IlliIlilIl;
   private final long iiIiIlilIl;

   public int Illlllllilll() {
      return this.IiliIlilIl;
   }

   public int IIlllIlliIll() {
      return this.illiIlilIl;
   }

   public int IlIlllIlilIl() {
      return this.IlliIlilIl;
   }

   public String iIlIlllllill() {
      return String.format(
         Locale.ROOT,
         Iilllilliill<"Iilllilliill","Ixr20uevfa8vpeNSznDWPqQtk3K9I6olM3vw2ErC+GC81XtEFCTgfRFElZp1Lr+8TWKLieznw5Z3+Z+2lgp4Ic2f34vY5/ueD3QJ1seFGbHchF5CbD15YHsqJ/YfMyP71mDMhX0xI/jbxcKOLToHRCtfmXvUzT3urQsb2bOWCNzbVmaU2qc+WA==">(),
         iiiliIIIii.IliIlllilIi(this.iiIiIlilIl),
         this.IIliIlilIl,
         this.lIliIlilIl,
         this.iIliIlilIl,
         this.IlliIlilIl,
         this.llliIlilIl,
         this.illiIlilIl,
         this.IiliIlilIl,
         this.IliIlllilIi(),
         this.liiiIIllIl()
      );
   }

   public int lIiiIiIlilli() {
      return this.IIliIlilIl;
   }

   public double iliIiiliiiii() {
      return this.lIliIlilIl;
   }

   public double IliIlllilIi() {
      return this.lIliIlilIl * 1.0
         + (double)this.iIliIlilIl * 3.0
         + (double)this.IlliIlilIl * 2.0
         + (double)this.llliIlilIl * 6.0
         + (double)this.illiIlilIl * 4.0
         + (double)this.IiliIlilIl * 8.0;
   }

   public double liiiIIllIl() {
      return this.IIliIlilIl <= 0 ? 0.0 : (double)this.IIliIlilIl / (1.0 + this.IliIlllilIi());
   }

   public int IIIllIIliIIl() {
      return this.iIliIlilIl;
   }

   public int IiIlliIliiIl() {
      return this.llliIlilIl;
   }

   public lIliiIIliIliiIIl(
      long standCell,
      int expectedConfirms,
      double travelBlocks,
      int jumpTransitions,
      int verticalTransitions,
      int verticalReversals,
      int tempBlocks,
      int unclearedTemp
   ) {
      this.iiIiIlilIl = standCell;
      this.IIliIlilIl = expectedConfirms;
      this.lIliIlilIl = travelBlocks;
      this.iIliIlilIl = jumpTransitions;
      this.IlliIlilIl = verticalTransitions;
      this.llliIlilIl = verticalReversals;
      this.illiIlilIl = tempBlocks;
      this.IiliIlilIl = unclearedTemp;
   }

   public long IilliliilIIi() {
      return this.iiIiIlilIl;
   }
}
