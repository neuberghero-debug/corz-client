package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public record IIllIlilIllIli(
   long target,
   long causalConfirmedCell,
   int lostDurablePoses,
   int previousCapability,
   long[] causalCells,
   long geometryFingerprint,
   long tempAssetFingerprint,
   int createdTick,
   IIIIlIlllIIIlIll state,
   List<lIilllIliIilllIl> tried,
   iilililIIiilil scope,
   int firstActionTick
) {
   private final iilililIIiilil lIliIIIIIl;
   private final IIIIlIlllIIIlIll iiIiIIIIIl;
   private final int iIIiIIIIIl;
   private final long lIIiIIIIIl;
   private final long ilIiIIIIIl;
   private final long[] llIiIIIIIl;
   private final int IlIiIIIIIl;
   private final long IIIiIIIIIl;
   private final long IiIiIIIIIl;
   private final int iIliIIIIIl;
   private final int liIiIIIIIl;
   private final List<lIilllIliIilllIl> IIliIIIIIl;

   public long Ililllililil() {
      return this.IiIiIIIIIl;
   }

   public int IIlllIlliIll() {
      return this.iIIiIIIIIl;
   }

   public int Illlllllilll() {
      return this.IlIiIIIIIl;
   }

   public iilililIIiilil IiIiliIiiiIi() {
      return this.lIliIIIIIl;
   }

   public Optional<lIilllIliIilllIl> iliIiiliiiii() {
      long var5 = -247063489978688742L;
      lIilllIliIilllIl[] var1 = lIilllIliIilllIl.values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIilllIliIilllIl var4 = var1[(int)var8];
         if (!this.IIliIIIIIl.contains(var4)) {
            return Optional.of(var4);
         }
      }

      return Optional.empty();
   }

   public IIllIlilIllIli iIlIlllllill(lIilllIliIilllIl a) {
      ArrayList var2 = new ArrayList<>(this.IIliIIIIIl);
      if (!var2.contains(a)) {
         var2.add(a);
      }

      return new IIllIlilIllIli(
         this.IIIiIIIIIl,
         this.lIIiIIIIIl,
         this.iIIiIIIIIl,
         this.IlIiIIIIIl,
         this.llIiIIIIIl,
         this.ilIiIIIIIl,
         this.IiIiIIIIIl,
         this.liIiIIIIIl,
         IIIIlIlllIIIlIll.illiIlllll,
         var2,
         this.lIliIIIIIl,
         this.iIliIIIIIl
      );
   }

   public long IIillIiliIil() {
      return this.ilIiIIIIIl;
   }

   public int lIiiIiIlilli() {
      return this.iIliIIIIIl < 0 ? -1 : this.iIliIIIIIl - this.liIiIIIIIl;
   }

   public boolean IliIlllilIi() {
      return this.iiIiIIIIIl == IIIIlIlllIIIlIll.llliIlllll || this.iiIiIIIIIl == IIIIlIlllIIIlIll.illiIlllll;
   }

   public IIllIlilIllIli(
      long target,
      long causalConfirmedCell,
      int lostDurablePoses,
      int previousCapability,
      long[] causalCells,
      long geometryFingerprint,
      long tempAssetFingerprint,
      int createdTick,
      IIIIlIlllIIIlIll state,
      List<lIilllIliIilllIl> tried,
      iilililIIiilil scope,
      int firstActionTick
   ) {
      causalCells = causalCells == null ? new long[0] : (long[])causalCells.clone();
      tried = tried == null ? List.of() : List.copyOf(tried);
      this.IIIiIIIIIl = target;
      this.lIIiIIIIIl = causalConfirmedCell;
      this.iIIiIIIIIl = lostDurablePoses;
      this.IlIiIIIIIl = previousCapability;
      this.llIiIIIIIl = causalCells;
      this.ilIiIIIIIl = geometryFingerprint;
      this.IiIiIIIIIl = tempAssetFingerprint;
      this.liIiIIIIIl = createdTick;
      this.iiIiIIIIIl = state;
      this.IIliIIIIIl = tried;
      this.lIliIIIIIl = scope;
      this.iIliIIIIIl = firstActionTick;
   }

   public List<lIilllIliIilllIl> IlIillIiilIi() {
      return this.IIliIIIIIl;
   }

   public int IIlilIliiIli() {
      return this.iIliIIIIIl;
   }

   public int Iiilliiliiil() {
      return this.liIiIIIIIl;
   }

   public IIllIlilIllIli liiiIIllIl(IIIIlIlllIIIlIll s) {
      return new IIllIlilIllIli(
         this.IIIiIIIIIl,
         this.lIIiIIIIIl,
         this.iIIiIIIIIl,
         this.IlIiIIIIIl,
         this.llIiIIIIIl,
         this.ilIiIIIIIl,
         this.IiIiIIIIIl,
         this.liIiIIIIIl,
         s,
         this.IIliIIIIIl,
         this.lIliIIIIIl,
         this.iIliIIIIIl
      );
   }

   public IIllIlilIllIli IilliliilIIi(int tick) {
      return this.iIliIIIIIl >= 0
         ? this
         : new IIllIlilIllIli(
            this.IIIiIIIIIl,
            this.lIIiIIIIIl,
            this.iIIiIIIIIl,
            this.IlIiIIIIIl,
            this.llIiIIIIIl,
            this.ilIiIIIIIl,
            this.IiIiIIIIIl,
            this.liIiIIIIIl,
            this.iiIiIIIIIl,
            this.IIliIIIIIl,
            this.lIliIIIIIl,
            tick
         );
   }

   public long IlIlllIlilIl() {
      return this.IIIiIIIIIl;
   }

   public String IIIllIIliIIl() {
      return String.format(
         Locale.ROOT,
         Illillliilli<"Illillliilli","kcrVuAJ5OGVvocungLXLMPCfUUvHb/zZbwzPV8ygwuVfQLRGL97WRhSX3WhCfcxnjyB/dWW1ypdsaJw4Ely0+9CO8YtO4le1mglGusm1ciQ5lkHnp8TNtpejtbbUGMKYJUhaZure/00l1+geRbxi0RWT2Pvzmg==">(),
         iiiliIIIii.IliIlllilIi(this.IIIiIIIIIl),
         iiiliIIIii.IliIlllilIi(this.lIIiIIIIIl),
         this.IlIiIIIIIl,
         this.iiIiIIIIIl,
         this.IIliIIIIIl,
         this.liIiIIIIIl,
         this.lIliIIIIIl == null
            ? Illillliilli<"Illillliilli","r/L91XxLJHfue6gO8OjdzrdIW3M9jbFGrD7vBvmb1HuskbiydlTxGm9OQ1Gha+g5YbaGW5bX">()
            : this.lIliIIIIIl.lIiiIiIlilli(),
         this.lIiiIiIlilli()
      );
   }

   public IIIIlIlllIIIlIll IIIilIIiiIIi() {
      return this.iiIiIIIIIl;
   }

   public long[] Iilllilliill() {
      return this.llIiIIIIIl;
   }

   public long IiIlliIliiIl() {
      return this.lIIiIIIIIl;
   }
}
