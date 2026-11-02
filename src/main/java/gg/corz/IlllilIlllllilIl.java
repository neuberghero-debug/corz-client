package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1311;
import net.minecraft.class_1657;
import net.minecraft.class_2561;

public class IlllilIlllllilIl extends ilIllIiIll {
   private long iilIlilIll;
   private long lllIlilIll;
   private int liiIlilIll;
   private int iiIIlilIll;
   private final lliliIIiililiIIi liiiIilIll = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","x5Z6uWs7owmzv2vdtg4a4g3RxvCT8GjfhiAMAtt5FLvrFjLVR/4G">(),
      IliIlllilIi<"IliIlllilIi","v0D9pKC6oIIibONFEsq19v30XWPc5RhO4cNwDSM7lsszQHw0J0UTXhs+7oW6hPV1gTty1AZZqzdEU8JI">(),
      IliIlllilIi<"IliIlllilIi","k25GbZY8/a+ekRFMzmrblNBNZKRjqBoMcRrr0s+1R1dEbxI=">(),
      IliIlllilIi<"IliIlllilIi","k25GbZY8/a+ekRFMzmrblNBNZKRjqBoMcRrr0s+1R1dEbxI=">(),
      IliIlllilIi<"IliIlllilIi","H6O9e0HyCA7Qp9tEr6J2zA5PmKNmY/OwvyJJzDiv4aze">()
   );
   private final lliliIIiililiIIi lIIIlilIll;
   private boolean lliIlilIll;
   private long iliIlilIll;
   private boolean iIiIlilIll;
   private boolean lilIlilIll;
   private final iiIiiilIIliiil IlIIlilIll;
   private final iilliIlIIiliIl iiiiIilIll = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","EgS7TPk3Fdi5jiB8aCBX6OtGOKIj8ALpJ0dKOy5sMilH">(),
      IliIlllilIi<"IliIlllilIi","fx4ohA+7bKkHTWLHqWdP7BwVwBQT1f1O8HsY7qcltMGag2dnlLUtmhWQSg+TOWFtwS7xxVBcE8GivAliWn/cozfCmRzwULLettLhgg==">(),
      5,
      1,
      15
   );
   private boolean IIiIlilIll;
   private final iilliIlIIiliIl IIIIlilIll = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","EGZbfQAbdwftZs+Bk1/vNgGvNwj3SN/mCRA8E0Nl0NsAQDk+mQ==">(),
      IliIlllilIi<"IliIlllilIi","B+jyID7kiQtkJ8IZbOxfWdJVfPBbX5YOJwVk2ftMm93+8/vfRpFsn0l3+xDHQDuD8D7ujJSk0xsX4DiziblJWQ9wz5O6zG3+xjRvUJYwcH+Ye7sKOAvhzJaBcuOgs/SVvNjTS2gZ">(),
      1,
      1,
      10
   );
   private long lIiIlilIll;
   private final iiIiiilIIliiil ilIIlilIll;
   private long IilIlilIll;
   private boolean lIlIlilIll;
   private final IIiiIIIllIiiIIIl llIIlilIll;
   private boolean iiiIlilIll;
   private boolean IIlIlilIll;
   private final ArrayDeque<String> illIlilIll;
   private boolean IllIlilIll;
   private boolean IliIlilIll;
   private final iilliIlIIiliIl IiIIlilIll;
   private int IiiIlilIll;
   private static final long IiiiIilIll = 30000L;
   private int iIlIlilIll;
   private final iiIiiilIIliiil liIIlilIll;
   private final lliliIIiililiIIi iIIIlilIll;

   @Override
   protected void Iilililiiili() {
      this.lllIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.IllIlilIll = false;
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.iIiIlilIll = false;
      this.IliIlilIll = false;
      this.lliIlilIll = false;
      this.iiiIlilIll = false;
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (this.iiiIlilIll) {
            this.iiiIlilIll = false;
            this.lIIlliIIll(this.lIIIlilIll.Iilllilliill());
            this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
         } else {
            if (this.ilIIlilIll.Iilllilliill() && !this.IllIlilIll && Iiiilllliiilll.field_1724.method_6032() <= (float)this.IiIIlilIll.Iilllilliill()) {
               double var1 = Iiiilllliiilll.field_1724.method_23317();
               double var3 = Iiiilllliiilll.field_1724.method_23318();
               double var5 = Iiiilllliiilll.field_1724.method_23321();

               for (class_1297 var8 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var8.method_5864().method_5891() == class_1311.field_6302) {
                     double var9 = var8.method_23317() - var1;
                     double var11 = var8.method_23318() - var3;
                     double var13 = var8.method_23321() - var5;
                     if (var9 * var9 + var11 * var11 + var13 * var13 <= 64.0) {
                        this.IlIllllIll(IliIlllilIi<"IliIlllilIi","UqKxZp3O3COyMc0T5Y1QHzjKFBDFyQbfXsYnQHpe06mbgaSLS+nFn27GvMO8nthq65RxttOnMKIECScdRBES">());
                        break;
                     }
                  }
               }
            }

            if (this.liIIlilIll.Iilllilliill() && !this.lilIlilIll && !this.iIiIlilIll) {
               for (class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
                  if (var2 instanceof class_1657 && var2 != Iiiilllliiilll.field_1724) {
                     String var21 = var2.method_5477().getString();
                     boolean var4 = false;

                     for (String var6 : this.IIllllIlll()) {
                        if (var6.equalsIgnoreCase(var21)) {
                           var4 = true;
                           break;
                        }
                     }

                     if (!var4) {
                        this.lllllillll(
                           IliIlllilIi<"IliIlllilIi","jrQkfxK0HWoulYbnAmaGsefERqxu9rEuW5A/EcPqejT0An8wHUzEaCBAFzv+1MSgsNQCCSyk6EBm7nTbOn4VDtJVIZVNP8fh3JIM+1o=">()
                        );
                        this.IIillIiliIil(false);
                        return;
                     }
                  }
               }
            }

            if (this.lilIlilIll) {
               if (!this.illIlilIll.isEmpty() && System.currentTimeMillis() >= this.IilIlilIll) {
                  this.iIlllIllll(IliIlllilIi<"IliIlllilIi","ERaIcIss6sVG+I5KQHB9wXR3f8UEQMYMg3xbhH66y2f/1tIL">() + this.illIlilIll.poll());
                  this.IilIlilIll = System.currentTimeMillis() + 1000L;
               }

               if (!this.IIiIlilIll) {
                  for (class_1297 var20 : Iiiilllliiilll.field_1687.method_18112()) {
                     if (var20 instanceof class_1657 && var20 != Iiiilllliiilll.field_1724) {
                        String var23 = var20.method_5477().getString();

                        for (String var27 : this.IIllllIlll()) {
                           if (var27.equalsIgnoreCase(var23)) {
                              this.IIiIlilIll = true;
                              this.lIiIlilIll = System.currentTimeMillis() + 5000L;
                              this.lllllillll(
                                 IliIlllilIi<"IliIlllilIi","yHhlQD1344m1iOyrmX2P1pW+TdjbWC1ovBvPAtiKh64FwFh1aw==">()
                                    + var23
                                    + IliIlllilIi<"IliIlllilIi","HTqCjcw6f5VIegYr/FCtKxI7bcQRdx2OZlDfLUmm4YjpE3r26cluNj9HHlrNKH93qkUEOq93154=">()
                              );
                              break;
                           }
                        }

                        if (this.IIiIlilIll) {
                           break;
                        }
                     }
                  }
               }

               if (this.IIiIlilIll && System.currentTimeMillis() >= this.lIiIlilIll) {
                  this.iiiIlIIIll();
               } else if (System.currentTimeMillis() >= this.iilIlilIll) {
                  this.lllllillll(
                     IliIlllilIi<"IliIlllilIi","A/JQiB524cFeIa2bOEczWVfX+rNQEqFok/HuRjtfTCXgGsYg9y+WIk0Bo/ihi7xHXaTCVr8oXBd7PodxXNJauVb+Qj6UI+AseCH1YX/S9id2">()
                  );
                  this.iiiIlIIIll();
               }
            } else if (this.lliIlilIll) {
               long var17 = System.currentTimeMillis();
               int var22 = Iiiilllliiilll.field_1724.method_31477() >> 4;
               int var24 = Iiiilllliiilll.field_1724.method_31479() >> 4;
               if (var22 != this.IiiIlilIll || var24 != this.liiIlilIll || var17 - this.iliIlilIll >= 30000L) {
                  this.lliIlilIll = false;
                  this.lllIlilIll = var17 + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
               }
            } else if (this.lllIlilIll < 0L) {
               if (!this.illIlilIll.isEmpty()) {
                  if (System.currentTimeMillis() >= this.IilIlilIll) {
                     this.iIlllIllll(IliIlllilIi<"IliIlllilIi","ERaIcIss6sVG+I5KQHB9wXR3f8UEQMYMg3xbhH66y2f/1tIL">() + this.illIlilIll.poll());
                     this.IilIlilIll = System.currentTimeMillis() + 1000L;
                  }
               } else if (this.IilIlilIll >= 0L && !this.lilIlilIll) {
                  this.IilIlilIll = -1L;
                  this.IIillIiliIil(false);
               }
            } else if (System.currentTimeMillis() >= this.lllIlilIll) {
               this.lllIlilIll = -1L;
               if (this.IliIlilIll) {
                  this.IliIlilIll = false;
               } else {
                  this.iIiIlilIll = false;
               }

               if (this.liIlliiIll() - this.iIlIlilIll >= this.IIIIlilIll.Iilllilliill()) {
                  if (this.liiiIilIll.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","H6O9e0HyCA7Qp9tEr6J2zA5PmKNmY/OwvyJJzDiv4aze">())) {
                     this.lllllillll(
                        IliIlllilIi<"IliIlllilIi","P8NT7lSTDhEhFXlwoQkukPNlFULuj7pXo9E4r4/uaj3QwGgvKpqb0eIISKxfqZBVll3I+Vrf3glRLXq46omWbYKFlzvIOUauCMtoQtUdE09mZuwr">()
                     );
                     this.lilIlilIll = true;
                     this.iilIlilIll = System.currentTimeMillis() + 600000L;
                     if (this.IlIIlilIll.Iilllilliill() && !this.IIllllIlll().isEmpty()) {
                        this.illIlilIll.addAll(this.IIllllIlll());
                        this.IilIlilIll = System.currentTimeMillis();
                     }
                  } else {
                     this.lllllillll(IliIlllilIi<"IliIlllilIi","HDpdX+rdEN7mqazGFC7gSP+7MRc2Z+n9kD9l1VCCFjSgpJQmEial4xsJk9WMZFcfvR4LVNUp4/wF75xL/N/PrfE=">());
                     if (this.IlIIlilIll.Iilllilliill() && !this.IIllllIlll().isEmpty()) {
                        this.illIlilIll.addAll(this.IIllllIlll());
                        this.IilIlilIll = System.currentTimeMillis();
                     } else {
                        this.IIillIiliIil(false);
                     }
                  }
               } else {
                  if (this.iIIIlilIll.Iilllilliill().equals(this.lIIIlilIll.Iilllilliill()) && !this.lIlIlilIll) {
                     this.lIlIlilIll = true;
                     this.Iillllilll(
                        IliIlllilIi<"IliIlllilIi","NKG4yzSKlgjmrbjK/WhhbVsv84Sac/ojUpi27tfK+VdQjtzW+xMOxX4JYXYAt0FyE3y9vZKGGnzCALSlwpEnY2d0h51VZ64Lb7wY41M=">()
                           + this.lIIIlilIll.Iilllilliill()
                           + IliIlllilIi<"IliIlllilIi","QE/+7LHh0dDw5yzN3pKJXtqEo8tbGeb5CuEVWUWfKNPbodfuIqlVmHfZFGJackI=">()
                     );
                  }

                  this.iiIIlilIll++;
                  boolean var16 = !this.iIIIlilIll.Iilllilliill().equals(this.lIIIlilIll.Iilllilliill()) && this.iiIIlilIll % 10 == 0 && !this.IIlIlilIll;
                  String var19 = var16 ? this.iIIIlilIll.Iilllilliill() : this.lIIIlilIll.Iilllilliill();
                  this.IIlIlilIll = var16;
                  this.lIIlliIIll(var19);
                  this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * 1000L;
               }
            }
         }
      }
   }

   private int liIlliiIll() {
      return llilIllililIll.iliIiiliiiii(lliIIiililiIIiil.class) instanceof lliIIiililiIIiil var2 ? var2.IIllllIlll() : 0;
   }

   private void ilIllIiIll() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(lliIIiililiIIiil.class);
      if (var1 != null && !var1.IliIlllilIi()) {
         var1.IIillIiliIil(true);
      }
   }

   @Override
   protected void Illillliilli() {
      this.ilIllIiIll();
      this.iIlIlilIll = this.liIlliiIll();
      this.iiIIlilIll = 0;
      this.IIlIlilIll = false;
      this.lIlIlilIll = false;
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.iIiIlilIll = false;
      this.IliIlilIll = false;
      this.lliIlilIll = false;
      this.IllIlilIll = false;
      this.lllIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.iiiIlilIll = true;
   }

   private void lllllillll(String s) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(IliIlllilIi<"IliIlllilIi","QZsw7LvaFCGiYgblUOT8RwGTEUSKU9COavWVklTQ6KoZJCETUcnWJ8GEunU7VhTJxoiI">() + s), false
            );
      }
   }

   private void lIIlliIIll(String dir) {
      this.iIlllIllll(IliIlllilIi<"IliIlllilIi","uV3w+0MMfRqEx+KynomlJewSQ4uyeaJ2OAozHpTihYA=">() + dir);
      this.lliIlilIll = true;
      this.iliIlilIll = System.currentTimeMillis();
      this.IiiIlilIll = Iiiilllliiilll.field_1724.method_31477() >> 4;
      this.liiIlilIll = Iiiilllliiilll.field_1724.method_31479() >> 4;
   }

   public IlllilIlllllilIl() {
      super(IliIlllilIi<"IliIlllilIi","WWeebHzymTudPmR4NYDJWCp//dFphaO3BOJkUhZ0d4+lnqRC5Vni/rGS">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIIIlilIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","VDXg62hA/+szTyoEm3nEiO0JQfM+S44cuiVJySkmaLK55w==">(),
         IliIlllilIi<"IliIlllilIi","9yTesT6H0+jKRtlQZQ3I4LXGz9ScM4Fi79no64KQ/J8NyjzXmV7x1/Wv9o2Q3/OxZ7p3MiPmuUAPzaLGPljw">(),
         IliIlllilIi<"IliIlllilIi","skXaPwd6lidnBDJB+45Y+fXzt7y5Zs51Ijd0Z9H0LLk=">(),
         IliIlllilIi<"IliIlllilIi","AE+kd3pkp/Qn39t8uZJVW/0IByeCEh3f+I1ZyE2StP8=">(),
         IliIlllilIi<"IliIlllilIi","skXaPwd6lidnBDJB+45Y+fXzt7y5Zs51Ijd0Z9H0LLk=">(),
         IliIlllilIi<"IliIlllilIi","ETCLMGpZwwdyHdKrawtNOzinNlFAqYxayrCrj6wmnGVH8B7kR3o=">(),
         IliIlllilIi<"IliIlllilIi","YfbE+0dg/TOA/EGChMXZbaK+ioNGbHQ/2GKMv7wC1Fyp2p8=">(),
         IliIlllilIi<"IliIlllilIi","LqqunvdvytpyS7zN8eBNy84iElz3c/LFp+TnxBDh2dXc2Lo=">(),
         IliIlllilIi<"IliIlllilIi","3BuX/EVG5lbuzcPW8Fnl1/JJIgs+wDThJAm+LXUDo7Y=">()
      );
      this.iIIIlilIll = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","IO4GVe3fJPWANj8GGVziK7FGdfE1L5oBW/muyJE3JodrJmUEiII=">(),
         IliIlllilIi<"IliIlllilIi","6HKTMXbhEzbrkH799hjwwNxVfY4f9U3YgCecwJZLiREgylVhOYNhX0/k7ak1fUAc4wXfelF3MPZC93TpEtVmL7gOyNFcRdEG5/YY2J5oKy3AfbHe5wJYXQcDCClwzem7GcnRoa6rR44=">(),
         IliIlllilIi<"IliIlllilIi","AE+kd3pkp/Qn39t8uZJVW/0IByeCEh3f+I1ZyE2StP8=">(),
         IliIlllilIi<"IliIlllilIi","AE+kd3pkp/Qn39t8uZJVW/0IByeCEh3f+I1ZyE2StP8=">(),
         IliIlllilIi<"IliIlllilIi","skXaPwd6lidnBDJB+45Y+fXzt7y5Zs51Ijd0Z9H0LLk=">(),
         IliIlllilIi<"IliIlllilIi","ETCLMGpZwwdyHdKrawtNOzinNlFAqYxayrCrj6wmnGVH8B7kR3o=">(),
         IliIlllilIi<"IliIlllilIi","YfbE+0dg/TOA/EGChMXZbaK+ioNGbHQ/2GKMv7wC1Fyp2p8=">(),
         IliIlllilIi<"IliIlllilIi","DiI6LxZNi/zBalgvF/eEdiSAe/+DY9wR+f4A88ARwCKoLg==">(),
         IliIlllilIi<"IliIlllilIi","LqqunvdvytpyS7zN8eBNy84iElz3c/LFp+TnxBDh2dXc2Lo=">(),
         IliIlllilIi<"IliIlllilIi","3BuX/EVG5lbuzcPW8Fnl1/JJIgs+wDThJAm+LXUDo7Y=">()
      );
      this.IlIIlilIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","8epAf3vrkBSa4Ew73t5SjIyEdGXRIv51l451ZhJ3rdGVFD8=">(),
         IliIlllilIi<"IliIlllilIi","Z0Jf518eY+qAvPHUg5qmRLMkr+LOHRZnrFnoKwkX2URilhYiJbd6IzQx4XWcmw2SAaOblyGLsgA+b7+RG/olNztQnXatVkRoHozKSaCaBXuzzCbPnimtSj4=">(),
         false
      );
      this.llIIlilIll = new IIiiIIIllIiiIIIl(
         IliIlllilIi<"IliIlllilIi","ezgBdeflrmIwM6iU4lL0DeG63Iyk5TrLLHwFYY4b0hvIFiAmLNgTZB4=">(),
         IliIlllilIi<"IliIlllilIi","HXSck7yPep8xAHRW9HLPXLPEUqui3N/4QDhZEMCJp5sKBFcz4KyeNpXl+NE3TcfJ1SXIwKJCwtlOFyLcnWClfaE3ZUwWdSOotBYffFjI3Q==">(),
         ""
      );
      this.ilIIlilIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","RLaKTNhZntAymdH5roGOtmPgc+XD94JpXbK3N6NR7Kr1QKlbA/I=">(),
         IliIlllilIi<"IliIlllilIi","CdcFlLaoojDvyQGzeLaWUXdwi1JsqBYhkK0U28wnVoPUpfS2vJXH/Wm/wSqFwIxLSoEta452u50IMAFuKur/WlrqPZBvsNjWJ80aFDBDV2z41hvuwLlLxit+X9DwkXx2/A==">(),
         true
      );
      this.IiIIlilIll = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","KZe/7h1e5PBcg9IH29383D9QFiA9fRB2dN9nfrtW8/SZRw==">(),
         IliIlllilIi<"IliIlllilIi","Q10uEsFkbl1bVGqTQEUTjrjN1hgYydhFol6GSFeA4K3v7lh1ai8V/bZ62M98alpEiFGoHdYrQciwOF4c2GXo4YNZ10le">(),
         5,
         1,
         20
      );
      this.liIIlilIll = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","pMqG+cpkkucjjKITH48HLALXPi69nMLYh0hEL6z4us+CUUj+oO9tKj+e">(),
         IliIlllilIi<"IliIlllilIi","RIgewCmSRZjE0P7Koa8vSWzaxtGu5B0e9N2+AS4SJrqxQk+L32VnA3uLj9i+W6cHnzJk/FsiSy4zjhSnG4Mz7B29b1sZ2e38vTqpjCZFZFKMPhYsjEKMs/EWp2pjVsq4ZsY=">(),
         true
      );
      this.iiIIlilIll = 0;
      this.IIlIlilIll = false;
      this.lIlIlilIll = false;
      this.iIlIlilIll = 0;
      this.IllIlilIll = false;
      this.lllIlilIll = -1L;
      this.illIlilIll = new ArrayDeque<>();
      this.IilIlilIll = -1L;
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.iIiIlilIll = false;
      this.IliIlilIll = false;
      this.lliIlilIll = false;
      this.iliIlilIll = 0L;
      this.IiiIlilIll = 0;
      this.liiIlilIll = 0;
      this.iiiIlilIll = false;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.liiiIilIll,
            this.iiiiIilIll,
            this.IIIIlilIll,
            this.lIIIlilIll,
            this.iIIIlilIll,
            this.IlIIlilIll,
            this.llIIlilIll,
            this.ilIIlilIll,
            this.IiIIlilIll,
            this.liIIlilIll
         }
      );
   }

   private List<String> IIllllIlll() {
      ArrayList var1 = new ArrayList();
      String var2 = this.llIIlilIll.Iilllilliill();
      if (var2 != null) {
         for (String var6 : var2.split(IliIlllilIi<"IliIlllilIi","d5BW9M5P4fIphz9jbfp1VFaSFTQPGoNEMcDAHNM=">())) {
            String var7 = var6.trim();
            if (!var7.isEmpty()) {
               var1.add(var7);
            }
         }
      }

      return var1;
   }

   private void iIlllIllll(String command) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         Iiiilllliiilll.field_1724.field_3944.method_45730(command);
      }
   }

   private void IlIllllIll(String reason) {
      this.IllIlilIll = true;
      this.lllllillll(IliIlllilIi<"IliIlllilIi","VCWFjEf7UcBVzmt/+oYjVYIcCTs+YdPVcf5V2nlH7KCiuDhlMMrYOnZeV88=">() + reason);
      this.IIillIiliIil(false);
      if (Iiiilllliiilll.method_1562() != null) {
         Iiiilllliiilll.method_1562()
            .method_48296()
            .method_10747(class_2561.method_43470(IliIlllilIi<"IliIlllilIi","djd1UubfTDmJ/eXPTtyWXCnU3gNmZ5J8Po/h2S9jUMTnHqkjuxqRHAhIG52o">() + reason));
      }
   }

   private void iiiIlIIIll() {
      this.lilIlilIll = false;
      this.iilIlilIll = -1L;
      this.IIiIlilIll = false;
      this.lIiIlilIll = -1L;
      this.illIlilIll.clear();
      this.IilIlilIll = -1L;
      this.iIiIlilIll = true;
      this.IliIlilIll = true;
      this.iIlIlilIll = this.liIlliiIll();
      this.lllllillll(IliIlllilIi<"IliIlllilIi","5+sxlvVNC0tcpTJ4MRzZqGC3aeedfJh+OKDxlUMc91qlSnfyDB3Ap8XGsPnCCVBTMf7O">());
      this.lllIlilIll = System.currentTimeMillis() + (long)this.iiiiIilIll.Iilllilliill() * (1931265355759818725L ^ 1931265355759817741L);
   }

   private void Iillllilll(String s) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(IliIlllilIi<"IliIlllilIi","A3e3J1zAsyxc35kwz5FUGKkxisOBdwIoRLIdfHnSRRuqluiLvwXgmRbxRikUUzQaHi82">() + s), false
            );
      }
   }
}
