package gg.corz;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2824;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public class lIiiIiiIiiIi extends ilIllIiIll {
   private final iilliIlIIiliIl lIIiIlIIliIIiIlIIl;
   private final iiIiiilIIliiil iiilIlIIlIIIiIlIIl;
   static final String[] llilIlIIlililIlIIl;
   private final lliliIIiililiIIi IiilIlIIlliilIlIIl = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","VRNiFVeAE0Pt4ueIm83d3CIBRJttceT8Fax1nWziifb+mQ51ogA=">(),
      IliIlllilIi<"IliIlllilIi","T3QKVFCYNR+1+O5rg6e7KoQzhBHxEfEXtNA3txSrW9LPKHGXS88Su19SDhOG4eFzYj5giffPpuBnKmnjQHHbziLX3fKJsZKpNnThso1ZIo09Z7yhwCLwQg1lfyiW6eov/2wv7VeVAe/yQ3Zcrtw5YT0jlIuR">(),
      IliIlllilIi<"IliIlllilIi","FOYZq5SQsx+w2cohHaIZGSwzDK9ceUKhvdYcXrtQF+MCMQ==">(),
      IliIlllilIi<"IliIlllilIi","FOYZq5SQsx+w2cohHaIZGSwzDK9ceUKhvdYcXrtQF+MCMQ==">(),
      IliIlllilIi<"IliIlllilIi","giRQx5VwiRpWuIjF8h2x0cYtlDRnRW1VpmC/xv/7WNR2VA==">()
   );
   private static final int iIilIlIIlIlilIlIIl = 100;
   private Object iiliIlIIlIIiiIlIIl;
   private final IiIliIiliIliIi llliIlIIlilliIlIIl;
   private final iiIiiilIIliiil IlIiIlIIlllIiIlIIl;
   private final class_1799[] iIliIlIIlIlliIlIIl;
   private final lllliliilllili IIliIlIIllIliIlIIl;
   private int IiliIlIIlliliIlIIl;
   private final IIIlIlIllIIlIlIl ilIiIlIIlIiIiIlIIl;
   private static final String IIilIlIIllIilIlIIl = "On Key";
   private final lliliIIiililiIIi[] liIiIlIIliiIiIlIIl;
   private static final String lillIlIIliillIlIIl = "Toggle";

   private void iiiIlIIIll() {
      this.IIliIlIIllIliIlIIl.IliIlllilIi();
      Arrays.fill(this.iIliIlIIlIlliIlIIl, null);
      this.IiliIlIIlliliIlIIl = 0;
      this.iiliIlIIlIIiiIlIIl = null;
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (Iiiilllliiilll.field_1687 != this.iiliIlIIlIIiiIlIIl) {
            this.iiliIlIIlIIiiIlIIl = Iiiilllliiilll.field_1687;
            Arrays.fill(this.iIliIlIIlIlliIlIIl, null);
         }

         this.ilIllIiIll(var1);
         if (this.IIliIlIIllIliIlIIl.liiiIIllIl(Iiiilllliiilll)) {
            boolean var2 = IliIlllilIi<"IliIlllilIi","giRQx5VwiRpWuIjF8h2x0cYtlDRnRW1VpmC/xv/7WNR2VA==">().equals(this.IiilIlIIlliilIlIIl.Iilllilliill());
            boolean var3 = this.IIliIlIIllIliIlIIl.IIlllIlliIll();
            if (!var2 || !var3 && this.IIliIlIIllIliIlIIl.IIillIiliIil() <= 200) {
               if (var3) {
                  this.IiliIlIIlliliIlIIl = 100;
               }

               if (this.IiliIlIIlliliIlIIl > 0) {
                  this.IiliIlIIlliliIlIIl--;
               }

               if (iillilIiIIililIi.liiiIIllIl(Iiiilllliiilll, this)) {
                  this.llliIlIIlilliIlIIl.IIIilIIiiIIi(var1);
                  boolean var4 = iillilIiIIililIi.IiIlliIliiIl(var1) && (var2 || !this.IIliIlIIllIliIlIIl.lIiiIiIlilli());
                  illlIlilIillIlil var5 = IlIIlIlillIIlIli.liiiIIllIl(this.llliIlIIlilliIlIIl, var4);
                  if (var5 == null) {
                     if (this.IIliIlIIllIliIlIIl.IIIilIIiiIIi(Iiiilllliiilll) && var2) {
                        this.IIillIiliIil(false);
                     }
                  } else {
                     this.IIliIlIIllIliIlIIl.Iiilliiliiil();
                     IlllIlilllllIlil var6 = this.IIliIlIIllIliIlIIl
                        .IiIlliIliiIl(IlIIlIlillIIlIli.IliIlllilIi(var5.IliIlllilIi(), var5.liiiIIllIl()), var1.method_31548().method_5438(var5.IliIlllilIi()));
                     if (var6 == IlllIlilllllIlil.llliIIiIil) {
                        this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
                        if (var2) {
                           this.IIillIiliIil(false);
                        }
                     } else if (var6 != IlllIlilllllIlil.IlliIIiIil) {
                        boolean var7 = Iiiilllliiilll.field_1755 instanceof class_490;
                        if (this.iiilIlIIlIIIiIlIIl.Iilllilliill() && !var7 && !var5.iIlIlllllill()) {
                           if (var2 || this.IiliIlIIlliliIlIIl == 0 && !this.IIliIlIIllIliIlIIl.lIiiIiIlilli() && iillilIiIIililIi.Illlllllilll(var1)) {
                              this.IIliIlIIllIliIlIIl.Ililllililil(Iiiilllliiilll);
                           }
                        } else if (!var7 || this.IIliIlIIllIliIlIIl.Illlllllilll()) {
                           boolean var8 = IlIllllIll(var1.method_31548().method_5438(var5.IliIlllilIi()));
                           boolean var9 = var5.iIlIlllllill() && (!this.IIliIlIIllIliIlIIl.lIiiIiIlilli() || var8);
                           boolean var10 = !var7
                              && this.IlIiIlIIlllIiIlIIl.Iilllilliill()
                              && (var9 || var2)
                              && !var1.method_5715()
                              && iillilIiIIililIi.IlIlllIlilIl();
                           if (var7 || var10 || iillilIiIIililIi.Illlllllilll(var1)) {
                              this.iIlllIllll(var1, var5, var10);
                           }
                        }
                     }
                  }
               }
            } else {
               this.lIIlliIIll();
            }
         }
      } else {
         this.IIliIlIIllIliIlIIl.IliIlllilIi();
      }
   }

   private IIilIiilIilIii IIllllIlll(int hotbar) {
      return IIilIiilIilIii.IilliliilIIi(this.liIiIlIIliiIiIlIIl[hotbar].Iilllilliill());
   }

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   static boolean IlIllllIll(class_1799 s) {
      return s.method_31574(class_1802.field_8634) || s.method_31574(class_1802.field_49098);
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (event.lIiilIIIIi instanceof class_2824 var2 && Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
         this.IIliIlIIllIliIlIIl.IilliliilIIi();
      }
   }

   static {
      String[] var10000 = new String[((-1700128077 - 95 ^ 53) >>> 3 | (-1700128077 - 95 ^ 53) << 29) ^ 861225797];
      var10000[0] = IliIlllilIi<"IliIlllilIi","VBzQ73+lwH5IphYriHkp8isp5qPZW+5prZiKQYFAhJ7F">();
      var10000[1] = IliIlllilIi<"IliIlllilIi","jJ4jAPiOX6htbt+AbMjXSJhOBloBP5ZzadG0bSodRw==">();
      var10000[2] = IliIlllilIi<"IliIlllilIi","uEJqmzImYxDynFW12x5N7LlqFGA9U26l4Qbe/ozW8HNP8g==">();
      var10000[3] = IliIlllilIi<"IliIlllilIi","vrAMVQPF7qeTSqAT0vHcJ6afsxiMkxcj3bWiRonbH2UUoKb3gKh2nQ==">();
      var10000[4] = IliIlllilIi<"IliIlllilIi","yobwxrU+FjpdxdFju6d9p8m4VYM/G7ScAEGndAdTignnfHYGT6O5">();
      var10000[5] = IliIlllilIi<"IliIlllilIi","c5m4m3rBSxpevXXAVLb+eItl+IlLhQtuEI/TFMk9wVGouEFUe0MfeA==">();
      var10000[-(-910636737 >>> 3 | -910636737 << 29) * -50529027 ^ 1365622899] = IliIlllilIi<"IliIlllilIi","0SQgTIxr/Tch4+dnkWx+9FxXx6MensTYJZGEf12TZg==">();
      var10000[-(-284346921 + -127) * 31 ^ 224823903] = IliIlllilIi<"IliIlllilIi","/sf60veNsdpWqB6FQhhYuVX42L0NNCWAgsgPT5iQJqs=">();
      var10000[-(-1444223710 * -1601513229) - -65 ^ -1067462413] = IliIlllilIi<"IliIlllilIi","hMmJ8IUnn8zTkUCBzNG+KqZH9OhpzmblG5GbhMQGFlY=">();
      llilIlIIlililIlIIl = var10000;
   }

   @Override
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
      }

      this.iiiIlIIIll();
   }

   private void iIlllIllll(class_746 mask, illlIlilIillIlil move, boolean p) {
      long var8 = 329437828936233022L;
      var8 ^= ((long)move.IliIlllilIi() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)move.liiiIIllIl() ^ var8) & -1L >>> 32;
      class_1799 var6 = mask.method_31548().method_5438((int)(var8 >>> 32)).method_7972();
      class_1799 var7 = mask.method_31548().method_5438((int)var8).method_7972();
      this.IIliIlIIllIliIlIIl
         .IiIiliIiiiIi(
            () -> {
               if (this.IliIlllilIi() && iillilIiIIililIi.iIlIlllllill(Iiiilllliiilll, this)) {
                  class_746 var5 = Iiiilllliiilll.field_1724;
                  if (!lllIIllillIIll.liiiIIllIl(sourceSnapshot) && !lllIIllillIIll.liiiIIllIl(target) && !lllIIllillIIll.IliIlllilIi(target)) {
                     class_1661 var6x = var5.method_31548();
                     int var7x = var6x.method_67532();
                     if (sourceSnapshot >= 9 || sourceSnapshot != var7x && !this.IIliIlIIllIliIlIIl.iliIiiliiiii(sourceSnapshot)) {
                        class_1799 var8x = var6x.method_5438(sourceSnapshot);
                        class_1799 var9 = var6x.method_5438(target);
                        if (iillilIiIIililIi.Iilllilliill(var8x, var6) && iillilIiIIililIi.Iilllilliill(var9, var7)) {
                           if (!var8x.method_31574(class_1802.field_8288) && !var9.method_31574(class_1802.field_8288)) {
                              if (target != var7x || var9.method_7960() || this.IIllllIlll(target).lIiiIiIlilli(var9)) {
                                 if (lIlillliIlilll.IliIlllilIi(this)) {
                                    try {
                                       int var10x = var5.field_7498.field_7763;
                                       Iiiilllliiilll.field_1761
                                          .method_2906(var10x, iillilIiIIililIi.IliIlllilIi(sourceSnapshot), target, class_1713.field_7791, var5);
                                       this.IIliIlIIllIliIlIIl.IIlilIliiIli();
                                       this.IIliIlIIllIliIlIIl.IIIllIIliIIl(IlIIlIlillIIlIli.IliIlllilIi(sourceSnapshot, target), var6);
                                       iillilIiIIililIi.Ililllililil(Iiiilllliiilll, var10x);
                                    } finally {
                                       lIlillliIlilll.liiiIIllIl(this);
                                    }

                                    if (sourceSnapshot < 9 && var6x.method_5438(sourceSnapshot).method_7960()) {
                                       this.iIliIlIIlIlliIlIIl[sourceSnapshot] = null;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            p,
            this.lIIiIlIIliIIiIlIIl.Iilllilliill()
         );
   }

   static boolean liIlliiIll(class_1799 b, class_1799 a) {
      return !b.method_7960() && !a.method_7960() && a.method_31574(b.method_7909())
         ? Objects.equals(b.method_58694(class_9334.field_49651), a.method_58694(class_9334.field_49651))
         : false;
   }

   public lIiiIiiIiiIi() {
      super(IliIlllilIi<"IliIlllilIi","4Ga4Wl1iFQEDUPUg1veM/hFujoMWVg29C5F2Q6Jo3c20lf23vlaW">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.iiilIlIIlIIIiIlIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","EFaqh8Hat6xujrukv8y+fjFOSgrcOLhwtisRabbz23oPSi5gHzL8xWFr">(),
         IliIlllilIi<"IliIlllilIi","73yojbn2maZf/6KL9TVxEdnKeAHMifQP5NmQZl3zwCQW+rAOfPX8Qkjf2gUUN1NalVtDpX7qWwt28sqKtNWnJa9LBBaat9hxx0FnUHPI9xRyhSqOqAAJ2Gj2+zm+kNb9iwuLd3alo57BDlOW3VP/r3xy/nUmPvZrlw6+7Y+mATXj6tjEdzQgKV0DxdmVVgN/">(),
         false
      );
      this.lIIiIlIIliIIiIlIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","v+hPSF3VOu0InMSM0LizUNxkCMNxjSwM1PFb8vi5Qlsc">(),
         IliIlllilIi<"IliIlllilIi","+Ymg8TYjxco1BTny2aTHvv1OEGnrCvfGWgkpEU3wBgeBF/Uj6YfzXmaQNnkqf4WP2wxKQJpi2+NZiSbgfkhBR0w73ZU4AFdtw4FmT2+LQ6xK">(),
         150,
         100,
         500,
         10
      );
      this.IlIiIlIIlllIiIlIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","k6lSmCGs4B4erOskTpU3W7pvoqSjL9+/XxEKn7FDKGj9w9t4HJ5r">(),
         IliIlllilIi<"IliIlllilIi","wBLhd+OA6zj2WlZKkHP49G7gITUR0+6ud6WsUxH3QSfkV03bu38jQYctAFnk/ivHRP/8IxWgpIBAG5085ZYVUQpMl85UewaM9hNUK21H+3zun7SaDzkiONLvq+N4Anh03YsacPCnDqA4XikWrcLsRvMdfN7LqEhf6f/vVUJRGZMcKYt4ohYq/gaGnBLTYh3OwVaQ7bEJb2wuM6+ujXcQDBEsXaI9bwGk6X1FkJGOzUwsy8xh0a5xbaKtt0rvas+vHUSwFbPAAlUUlw==">(),
         true
      );
      this.ilIiIlIIlIiIiIlIIl = new IIIlIlIllIIlIlIl(
         IliIlllilIi<"IliIlllilIi","rDwJ2KZu4W/Qq9y4HNUAVEkTVL5XQ+bXViNBO3JvEUOnAlUwrHM4/g==">(),
         IliIlllilIi<"IliIlllilIi","VMQoq+vYNAHILPnpyF/KVT0J1J0rZ4D7BGFz32xKto6OkXYsLX8MFjeNLYgZPfsuQrBEppX1vI41lIr8WdD+ZPOBrnfbqzQu3xpgYMAwZODHXtSqksxOdWmnOHrffig+dET8Xgax6VVSI50qbp7FtFKiz30Ee3OllekuyYA=">(),
         List.of(class_1802.field_8634)
      );
      this.liIiIlIIliiIiIlIIl = new lliliIIiililiIIi[9];
      this.IIliIlIIllIliIlIIl = new lllliliilllili(this);
      this.iIliIlIIlIlliIlIIl = new class_1799[9];
      this.llliIlIIlilliIlIIl = new IiIliIiliIliIi(this);
      String[] var1 = IIilIiilIilIii.iIlIlllllill();

      for (int var2 = 0; var2 < 9; var2++) {
         this.liIiIlIIliiIiIlIIl[var2] = new lliliIIiililiIIi(
            IliIlllilIi<"IliIlllilIi","Xhhpy7MGhYDsGCjsOlBS4LLusNKwFGtSaIFNrT5nGo+q">() + (var2 + 1),
            IliIlllilIi<"IliIlllilIi","yL50DFzeIV2d5ZXDGiW3q66m0Hp92kzfS8Y4Q6O9MrOWquS1XSjHp267TZB8Z8R4s0gjolA=">()
               + (var2 + 1)
               + IliIlllilIi<"IliIlllilIi","3eF6w8zAWTTJEUwdSg3VWKNnpLvMKIe6kBRUyd2t+CeMRe2coo65G4IL92pnr2enyd4lJhiXYlWK">(),
            llilIlIIlililIlIIl[var2],
            var1
         );
         this.liIiIlIIliiIiIlIIl[var2].iIlIlllllill(IliIlllilIi<"IliIlllilIi","2s7lHYJO9cYD+AtMcjNUkRikW4itRFropFaNIA3/3lXkTQ==">());
      }

      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.IiilIlIIlliilIlIIl, this.iiilIlIIlIIIiIlIIl, this.lIIiIlIIliIIiIlIIl, this.IlIiIlIIlllIiIlIIl, this.ilIiIlIIlIiIiIlIIl}
      );
      this.IlIlllIlilIl(this.liIiIlIIliiIiIlIIl);
   }

   private void ilIllIiIll(class_746 p) {
      boolean var2 = Iiiilllliiilll.field_1755 instanceof class_465 && !this.IIliIlIIllIliIlIIl.Iilllilliill();
      class_1661 var3 = p.method_31548();

      for (int var4 = 0; var4 < 9; var4++) {
         class_1799 var5 = var3.method_5438(var4);
         if (!var5.method_7960()) {
            if (this.iIliIlIIlIlliIlIIl[var4] == null || !liIlliiIll(this.iIliIlIIlIlliIlIIl[var4], var5)) {
               this.iIliIlIIlIlliIlIIl[var4] = var5.method_46651(1);
            }
         } else if (var2) {
            this.iIliIlIIlIlliIlIIl[var4] = null;
         }
      }
   }

   private void lIIlliIIll() {
      this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
      this.IIillIiliIil(false);
   }
}
