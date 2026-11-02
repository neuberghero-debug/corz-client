package gg.corz;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

public final class llllliIiilllliIi {
   private static final int IIlliliIIi = 20;
   private final Map<IIliiilIliii, llillliilillli> iiIliliIIi = new EnumMap<>(IIliiilIliii.class);

   private llillliilillli IlIlllIlilIl(IIliiilIliii g) {
      return this.iiIliliIIi.computeIfAbsent(g == null ? IIliiilIliii.iiiiIIiIlIIIIlIiIl : g, k -> new llillliilillli());
   }

   public double iliIiiliiiii(IIliiilIliii g) {
      llillliilillli var2 = this.IlIlllIlilIl(g);
      return var2.llliIiIIIl <= 0L ? 0.0 : (double)var2.llliIiIIIl / (IiIlliIliiIl(var2) / 60.0);
   }

   private static double IiIlliIliiIl(llillliilillli s) {
      long var2 = -4907061852654364517L;
      var2 ^= ((long)(s.lliiIiIIIl < 0 ? 0 : s.iliiIiIIIl - s.lliiIiIIIl) << 32 ^ var2) & -1L << 32;
      return Math.max(1.0, (double)((int)(var2 >>> 32)) / 20.0);
   }

   public static IIliiilIliii IliIlllilIi(
      String deck, boolean recipeKind, boolean interactiveBlock, boolean accessPlan, boolean missionKind, boolean multiface, String sixWay
   ) {
      long var10 = 2000023310874173809L;
      String var7 = sixWay == null ? "" : sixWay;
      if (accessPlan) {
         return IIliiilIliii.lliiIIiIliliiIIiIl;
      } else if (multiface) {
         return IIliiilIliii.IiiiIIiIlliiiIIiIl;
      } else if (interactiveBlock || var7.equals(Illlllllilll<"Illlllllilll","QmZh/F+isqwcdL6yIeo8YP79zPMKWYt5obFz5e2tDI/YOhxFCQ+WHMJeaw8p">())) {
         return IIliiilIliii.IIiiIIiIllIiiIIiIl;
      } else if (recipeKind || var7.equals(Illlllllilll<"Illlllllilll","2O3VcXkSxjWWQj6b6PGgvnP4TiwEY08bROvx+Twre7/FZVLETcRNls1M5sAgUQ4=">())) {
         return IIliiilIliii.liliIIiIliiliIIiIl;
      } else if (missionKind) {
         return IIliiilIliii.iIiiIIiIlIliiIIiIl;
      } else {
         var10 ^= ((long)Illlllllilll<"Illlllllilll","7nKESxKJd1mw0iZEGAmNDdNiKmd6c4OnxQipENM6bO/n">().equals(deck) << 32 ^ var10) & -1L << 32;
         var10 ^= (
               (long)(
                     !var7.equals(Illlllllilll<"Illlllllilll","3XkNfC+rr0UxBaXoxAHk1g4OmF/9bmaL+arKgIBprFNACFcZeqteVw==">())
                           && !var7.equals(Illlllllilll<"Illlllllilll","Zf/kJgQSE6BZRH+3JXmNzQ9W1bnp8dg3vT1TCimSrHADeddpcpkSzA==">())
                           && !var7.equals(Illlllllilll<"Illlllllilll","F38oTdDp4bmq3JSOfDfEM5jJqogcU2HV4hoSvrZX3fny4uhiW2v02IcKf7cTVQ==">())
                        ? 0
                        : 1
                  )
                  ^ var10
            )
            & -1L >>> 32;
         return (int)(var10 >>> 32) != 0 && (int)var10 != 0 ? IIliiilIliii.illiIIiIlIiliIIiIl : IIliiilIliii.iiiiIIiIlIIIIlIiIl;
      }
   }

   public void iIlIlllllill(IIliiilIliii g) {
      this.IlIlllIlilIl(g).liliIiIIIl++;
   }

   public String IIIllIIliIIl(int tick) {
      long var12 = 5063774035518119402L;
      StringBuilder var2 = new StringBuilder();
      IIliiilIliii[] var3 = IIliiilIliii.values();
      var12 ^= ((long)var3.length << 32 ^ var12) & -1L << 32;

      for (long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         IIliiilIliii var6 = var3[(int)var15];
         llillliilillli var7 = this.iiIliliIIi.get(var6);
         if (var7 != null && var7.llliIiIIIl > 0L) {
            if (var2.length() > 0) {
               var2.append(' ');
            }

            double var8 = IiIlliIliiIl(var7);
            double var10 = var7.lIiiIiIIIl <= 0L ? 0.0 : (double)var7.IIiiIiIIIl / (double)var7.lIiiIiIIIl;
            var2.append(
               String.format(
                  Locale.ROOT,
                  Illlllllilll<"Illlllllilll","ks2nSVxBkB42fAnqDx4mR8c8YNTK8BkPcWDGAuM7Pz9SuJLVrim6Bgzrt/CGqcUuzmBraZk3ULbGpOHtaWsXyh4akvz8EqAd6U7hU6rdKfjWV0NrWaa7sSYQw1xvKTW2/zaQXZn7jEVe/76GoH6WgA7FDBQ68t+1xnFXp0yeMA6nKeIvdH3paRTJTbNg3+IziBPrGZlpMMqxI1Sl9Wtml9AXQqlVXrXiton8nhwUimzAQrc=">(),
                  var6.name(),
                  var7.llliIiIIIl,
                  (double)var7.llliIiIIIl / (var8 / 60.0),
                  var7.iIiiIiIIIl / (double)var7.llliIiIIIl,
                  var7.IliiIiIIIl / (double)var7.llliIiIIIl,
                  (double)var7.illiIiIIIl / (var8 * 20.0),
                  var7.IiliIiIIIl,
                  var7.liliIiIIIl,
                  var7.iiliIiIIIl,
                  var10
               )
            );
         }
      }

      return var2.toString();
   }

   public void liiiIIllIl(IIliiilIliii sneakTicks, int rotationDegrees, double rollback, double g, int missionSwitches, boolean walkBlocks, int tick) {
      llillliilillli var10 = this.IlIlllIlilIl(sneakTicks);
      var10.llliIiIIIl++;
      if (var10.lliiIiIIIl < 0) {
         var10.lliiIiIIIl = rotationDegrees;
      }

      var10.iliiIiIIIl = rotationDegrees;
      var10.iIiiIiIIIl += rollback;
      var10.IliiIiIIIl += g;
      var10.illiIiIIIl = var10.illiIiIIIl + (long)Math.max(0, missionSwitches);
      if (walkBlocks) {
         var10.IiliIiIIIl++;
      }

      var10.iiliIiIIIl = var10.iiliIiIIIl + (long)Math.max(0, tick);
   }

   public void IilliliilIIi(IIliiilIliii g, int length) {
      llillliilillli var3 = this.IlIlllIlilIl(g);
      var3.lIiiIiIIIl++;
      var3.IIiiIiIIIl += (long)length;
   }

   public long lIiiIiIlilli(IIliiilIliii g) {
      return this.IlIlllIlilIl(g).llliIiIIIl;
   }
}
