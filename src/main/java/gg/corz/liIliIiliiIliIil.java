package gg.corz;

import java.util.Locale;

public record liIliIiliiIliIil(long expectedFinalComponent, int usefulTargetsAfterConfirm, boolean reusableSurface, boolean safeDescent, long returnAnchor) {
   private final boolean lliIIilIil;
   private final long iIiIIilIil;
   public static final liIliIiliiIliIil liiIIilIil = new liIliIiliiIliIil(0L, 0, false, false, 0L);
   private final boolean iliIIilIil;
   private final int IliIIilIil;
   private final long IiiIIilIil;

   public long IlIlllIlilIl() {
      return this.IiiIIilIil;
   }

   public liIliIiliiIliIil(long expectedFinalComponent, int usefulTargetsAfterConfirm, boolean reusableSurface, boolean safeDescent, long returnAnchor) {
      this.iIiIIilIil = expectedFinalComponent;
      this.IliIIilIil = usefulTargetsAfterConfirm;
      this.lliIIilIil = reusableSurface;
      this.iliIIilIil = safeDescent;
      this.IiiIIilIil = returnAnchor;
   }

   public long IilliliilIIi() {
      return this.iIiIIilIil;
   }

   public String iIlIlllllill() {
      return String.format(
         Locale.ROOT,
         IiIlliIliiIl<"IiIlliIliiIl","GnzS9x7nUR7VpJo9qRe4ZVwUYXt2nxIJrDMaP1UHgFSs6xs9YqyOyWpRFjIMfmvCVb7cC3N0rVCathGmgHjDTyVo6SyxKTvr9DQ/de/FGg+UkWX7DQiIY/Yhp4EbObXaY/1PZFKAstG4M57mAjnZ1R0F95OfK2q77wcHiuo3S44hHg17">(),
         this.iIiIIilIil,
         this.IliIIilIil,
         this.lliIIilIil,
         this.iliIIilIil,
         this.IiiIIilIil
      );
   }

   public static liIliIiliiIliIil IliIlllilIi(long base, long baseComponent, boolean ownColumn) {
      return new liIliIiliiIliIil(base, 0, false, ownColumn, baseComponent);
   }

   public boolean IIIllIIliIIl() {
      return this.iliIIilIil;
   }

   public boolean iliIiiliiiii() {
      return this.lliIIilIil;
   }

   public int lIiiIiIlilli() {
      return this.IliIIilIil;
   }

   public static liIliIiliiIliIil liiiIIllIl(long base, int ownColumn, long unlocks, boolean surfaceComponent) {
      return new liIliIiliiIliIil(base, Math.max(0, ownColumn), true, surfaceComponent, unlocks);
   }
}
