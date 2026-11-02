package gg.corz;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public final class IIllliIilIllliIi {
   private static final String IIIliliIIi = "PRIVATE";

   public static boolean IliIlllilIi() {
      return IIIIIllllIIIIlll.Ililllililil() != null;
   }

   private static Set<String> IIIllIIliIIl() {
      HashSet var0 = new HashSet();

      for (IlIIillllIIill var2 : lilllIiliilllIil.lIiiIiIlilli()) {
         try {
            var0.add(var2.IIIIilIIilIIIilIIi.IIIllIIliIIl());
         } catch (Exception var5) {
         }

         try {
            lIlIllIliIlIllIl var3 = IlliIilllliIil.IliIlllilIi(var2.IIIIilIIilIIIilIIi);
            if (var3 != null) {
               var0.add(var3.IIIllIIliIIl());
            }
         } catch (Exception var4) {
         }
      }

      return var0;
   }

   public static void iIlIlllllill(Consumer<Integer> onDone) {
      if (!IliIlllilIi()) {
         if (onDone != null) {
            onDone.accept(0);
         }
      } else {
         IlliIilllliIil.IIIllIIliIIl(onDonex -> {
            if (onDonex.iiiIilIllIIIlilIll && onDonex.lIIlilIlliIIlilIll != null) {
               Set var2 = IIIllIIliIIl();
               int[] var3 = new int[]{0};
               int[] var4 = new int[]{0};
               boolean[] var5 = new boolean[]{false};

               for (lllililillilil var7 : onDonex.lIIlilIlliIIlilIll.ilillIlIlIiillIlIl) {
                  if (var7.lIiIilIliiIiIilIli == null || !var2.contains(var7.lIiIilIliiIiIilIli)) {
                     String var8 = lilllIiliilllIil.Iilllilliill(var7.IlIIilIlillIIilIli);
                     if (var8 == null || !lilllIiliilllIil.IlIlllIlilIl(var8)) {
                        var3[0]++;
                        IlliIilllliIil.iliIiiliiiii(var7.IlIIilIlillIIilIli, null, listed -> {
                           if (listed.iiiIilIllIIIlilIll) {
                              try {
                                 lIlIllIliIlIllIl var6 = lIlIllIliIlIllIl.lIiiIiIlilli(listed.lIIlilIlliIIlilIll.iIIliliill, null);
                                 if (var6 != null) {
                                    String var7x = lilllIiliilllIil.Illlllllilll(var6, var7.IlIIilIlillIIilIli);
                                    lIiiIiIlilli(var7x, var7.IlIIilIlillIIilIli);
                                    synchronized (var4) {
                                       var4[0]++;
                                    }
                                 }
                              } catch (IOException var13) {
                              }
                           }

                           synchronized (var3) {
                              var3[0]--;
                              if (var5[0] && var3[0] == 0 && onDone != null) {
                                 onDone.accept(var4[0]);
                              }
                           }
                        });
                     }
                  }
               }

               synchronized (var3) {
                  var5[0] = true;
                  if (var3[0] == 0 && onDone != null) {
                     onDone.accept(var4[0]);
                  }
               }
            } else {
               if (onDone != null) {
                  onDone.accept(-1);
               }
            }
         });
      }
   }

   private IIllliIilIllliIi() {
   }

   private static void lIiiIiIlilli(String slug, String id) {
      try {
         IillilIilillilIi var2 = lilllIiliilllIil.lllllillll(slug);
         if (var2.lllIillIIi == null) {
            var2.lllIillIIi = ilIIIllIiIIIll.IlIIlIIilllIIlIIil;
         }

         var2.illIillIIi = id;
         lilllIiliilllIil.iilllIIill(slug, var2);
      } catch (IOException var3) {
      }
   }

   public static void IilliliilIIi(String slug) {
      IillilIilillilIi var1 = lilllIiliilllIil.lllllillll(slug);
      if (var1.illIillIIi != null && !var1.illIillIIi.isBlank() && IliIlllilIi()) {
         IlliIilllliIil.Iilllilliill(var1.illIillIIi, r -> {
         });
      }
   }

   public static void liiiIIllIl(String cb, Consumer<lIlliiiIllii> slug) {
      if (!IliIlllilIi()) {
         slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<"IIillIiliIil","3wEXuCNMlpqgpaPQIi1bo1DQuCJcnH7nRgDG8DwCt2WUXJPp/xmA8I5Ry/O918Bi1LdslSA=">()));
      } else {
         IillilIilillilIi var2 = lilllIiliilllIil.lllllillll(cb);
         if (var2.illIillIIi != null && !var2.illIillIIi.isBlank()) {
            slug.accept(lIlliiiIllii.IliIlllilIi(var2.illIillIIi));
         } else {
            lIlIllIliIlIllIl var3;
            try {
               var3 = lilllIiliilllIil.iliIiiliiiii(cb);
            } catch (IOException var6) {
               slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<"IIillIiliIil","M4VviRpERX2H2ZLKFuXyarzeEvc5EyyIIa9FLCx6eTOH6lFXxjY5iYqrytolAFxFK/HP5Yc=">()));
               return;
            }

            if (var3 == null) {
               slug.accept(lIlliiiIllii.liiiIIllIl(IIillIiliIil<"IIillIiliIil","I8h6a/43s6nCGyBeE47dnBTwYsNRgWYf7IOiChiSFle+VF1YFqvJxX/jo3Js">()));
            } else {
               lIlIllIliIlIllIl var4 = IlliIilllliIil.IliIlllilIi(var3);
               if (var4 == null) {
                  slug.accept(
                     lIlliiiIllii.liiiIIllIl(IIillIiliIil<"IIillIiliIil","69fLt8cwZ8n0zeBWYH9QZP88Q5E+ArT4baQCvFas1JNZhjEzXrM0CHfOy76IkT2J04fPhI6aKmVfIAPQ">())
                  );
               } else {
                  String var5 = var4.IIIllIIliIIl();
                  IlliIilllliIil.IlIlllIlilIl(
                     var3,
                     var3.llIiilIiIl,
                     IIillIiliIil<"IIillIiliIil","KKoTVbg8nyvUZ648OyicwCwXDgwta8H21DSrFtqY0siO27A=">(),
                     IIillIiliIil<"IIillIiliIil","A3Se6vonu1avdnY6FLxRnj2js5Xcpy0xca/i2fQQj5sTL+G5u7NKqyI=">(),
                     cbx -> {
                        if (cbx.iiiIilIllIIIlilIll) {
                           lIiiIiIlilli(cb, cbx.lIIlilIlliIIlilIll.IlIIilIlillIIilIli);
                           slug.accept(lIlliiiIllii.IliIlllilIi(cbx.lIIlilIlliIIlilIll.IlIIilIlillIIilIli));
                        } else if (IIillIiliIil<"IIillIiliIil","i22oZGh8O0wwszULBe4W9g8PYiOBFOtFEtdoge1mUksTmWiRKA==">().equals(cbx.IlIlilIllllIlilIll)) {
                           IlliIilllliIil.IIIllIIliIIl(
                              mineRes -> {
                                 if (mineRes.iiiIilIllIIIlilIll) {
                                    String var4x = iliIiiliiiii(mineRes.lIIlilIlliIIlilIll, var5);
                                    if (var4x != null) {
                                       lIiiIiIlilli(cb, var4x);
                                       slug.accept(lIlliiiIllii.IliIlllilIi(var4x));
                                       return;
                                    }
                                 }

                                 slug.accept(
                                    lIlliiiIllii.liiiIIllIl(
                                       IIillIiliIil<"IIillIiliIil","ePxoYf0lSd41k5EZLrl6b89MPNloIjCgM8RZyZqz8DglklBDZ9BgJUGCiOlyQU/c2qJrm63JCldX3LRBoAEPfGUZsdA=">()
                                    )
                                 );
                              }
                           );
                        } else {
                           slug.accept(
                              lIlliiiIllii.liiiIIllIl(
                                 cbx.ilIlilIllIiIlilIll != null
                                    ? cbx.ilIlilIllIiIlilIll
                                    : IIillIiliIil<"IIillIiliIil","2yktQtAacPPTxr4TzaNY1aeZ+w+UdBf0ZWa+DVTzxZxE0etXcipGH+ReBlZRc+Tyxnp78Wgj">()
                              )
                           );
                        }
                     }
                  );
               }
            }
         }
      }
   }

   private static String iliIiiliiiii(Ilillillilli listing, String sha) {
      if (listing != null && sha != null) {
         for (lllililillilil var3 : listing.ilillIlIlIiillIlIl) {
            if (sha.equalsIgnoreCase(var3.lIiIilIliiIiIilIli)) {
               return var3.IlIIilIlillIIilIli;
            }
         }

         return null;
      } else {
         return null;
      }
   }
}
