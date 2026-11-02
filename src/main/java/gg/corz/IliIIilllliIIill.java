package gg.corz;

public final class IliIIilllliIIill {
   public static String liiiIIllIl(String id) {
      long var4 = 1768798641190019686L;
      if (id != null && !id.isEmpty()) {
         var4 ^= (-4294967296L ^ var4) & -1L << 32;
         switch (id.hashCode()) {
            case -1526768685:
               if (id.equals(iIlIlllllill<"iIlIlllllill","sTwN3JQsri/aV8KbFYEJ10/RIBEHWw1qIMBGnr/eDBGfNNGUkj0+83uZ659k4jai">())) {
                  var4 ^= (4294967296L ^ var4) & -1L << 32;
               }
               break;
            case 1104210353:
               if (id.equals(iIlIlllllill<"iIlIlllllill","on9ef+yawUXBzpPVRdgD2nMu2xBntf5/yZpZEldl+PmhVdLro1JuY7dJerPlsrw=">())) {
                  var4 ^= (0L ^ var4) & -1L << 32;
               }
               break;
            case 1731133248:
               if (id.equals(iIlIlllllill<"iIlIlllllill","+UWq6boCa6flUPmbn9O2mWhZgUfBc6ayzvNhg+0kUmBgKQkfwGTODeeGJ6By">())) {
                  var4 ^= (8589934592L ^ var4) & -1L << 32;
               }
         }
         return switch ((int)(var4 >>> 32)) {
            case 0 -> iIlIlllllill<"iIlIlllllill","3ft0FdFm1HAWW0PhbH0kYSzBwGtskMfmkgnvA7xQEMyOEy4kPcJGyuI=">();
            case 1 -> iIlIlllllill<"iIlIlllllill","YLiLprgXfe81Ms7z1KNhXhFA++guh1Lky992kRpQSYJSKFRSctA=">();
            case 2 -> iIlIlllllill<"iIlIlllllill","xRgg895oCHgddq8OErtAuEX/XUYAj0TOWvNkMtzBdbJ769Q=">();
            default -> {
               var4 ^= ((long)id.indexOf(58) ^ var4) & -1L >>> 32;
               yield (int)var4 >= 0 && (int)var4 + 1 < id.length() ? id.substring((int)var4 + 1) : id;
            }
         };
      } else {
         return iIlIlllllill<"iIlIlllllill","keB6Sb41A5JrI9VeVdNau5BqmoVVNUl+aFQw4nq/a7C7CC5A">();
      }
   }

   private IliIIilllliIIill() {
   }

   public static IiiiIIlliiiIIl IliIlllilIi(
      llIIliIiilIIliIi offered, llIIliIiilIIliIi myDimension, llIIliIiilIIliIi manualOverride, String iAmAuthority, boolean seated, boolean live
   ) {
      if (manualOverride != null && manualOverride.IliIlllilIi()) {
         if (iAmAuthority == null || iAmAuthority.isEmpty() || !manualOverride.IlIlllIlilIl().equals(iAmAuthority)) {
            return new IiiiIIlliiiIIl(
               lIIiiiIIii.IIilIlIllIilIlIl,
               null,
               iIlIlllllill<"iIlIlllllill","dh+TD0IYWjBWbqxMnJfd6BMFdB9+aBDQBLpWzyK7vhmxPjhaeHWnfTfdNNkD9+Lk/SkV6g==">()
                  + liiiIIllIl(manualOverride.IlIlllIlilIl())
                  + iIlIlllllill<"iIlIlllllill","MNILKgfog8SQLnMha1fzKLevNiHIJMwekZJwdTETLrO95vyqgTREDGxaoxY=">()
                  + liiiIIllIl(iAmAuthority)
                  + iIlIlllllill<"iIlIlllllill","rbglnd7mreqPl4nA1XNZPocvcYmZzSIyeT9b8oqH43w1HXxHg76In6x7JlLKC1TxMPrP8yV/b4CifTg=">()
            );
         } else if (offered != null && offered.liiiIIllIl(manualOverride)) {
            if (myDimension != null && !myDimension.liiiIIllIl(manualOverride) && seated && !live) {
               return new IiiiIIlliiiIIl(
                  lIIiiiIIii.iIilIlIlIlilIlIl,
                  null,
                  iIlIlllllill<"iIlIlllllill","z3KQBKjSLFiGHvyJ7vQVHseqsEFn1SROIa3lZdrfBRFS8U7ZTol3jGf20ZWMTQpNwODP2TJ3SDj/k2FDdIWnfCq/R4jAVn3nFuzHr65cOC+mZ3p2CHhKQxU=">()
                     + manualOverride.IIIllIIliIIl().lIiiIiIlilli()
               );
            } else {
               return myDimension != null && !myDimension.liiiIIllIl(manualOverride)
                  ? new IiiiIIlliiiIIl(lIIiiiIIii.illlIlIlIillIlIl, manualOverride, "")
                  : new IiiiIIlliiiIIl(lIIiiiIIii.lillIlIliillIlIl, null, "");
            }
         } else if (offered != null) {
            return new IiiiIIlliiiIIl(
               lIIiiiIIii.illlIlIlIillIlIl,
               manualOverride,
               iIlIlllllill<"iIlIlllllill","Pvx/puAAEp6X5ekLl8v5Ro4kvM+rPWt/Tfpk5iqolC0pdJ0f8bGd60c6TKARWzgexP2YOgbi2Ik=">()
                  + manualOverride.IIIllIIliIIl().lIiiIiIlilli()
                  + iIlIlllllill<"iIlIlllllill","eL80rDlJ8E/tDBWi5kJM+YVLTjNb+tcyzSWOHVg1Gbd72V6aOOtY746tJXNY">()
            );
         } else {
            return myDimension != null && myDimension.liiiIIllIl(manualOverride)
               ? new IiiiIIlliiiIIl(lIIiiiIIii.IlllIlIlllllIlIl, manualOverride, "")
               : new IiiiIIlliiiIIl(
                  lIIiiiIIii.IlllIlIlllllIlIl,
                  manualOverride,
                  iIlIlllllill<"iIlIlllllill","kvhzT+WtwxQnGqMsBbqlSpHOtF9w7fcPWP8O+MXdA7yK9qOgFQn6aCS8gAgXHvgoP9LID8AtABi8mI5AjgVuQhqEQyvM2Fpdw18=">()
                     + manualOverride.IIIllIIliIIl().lIiiIiIlilli()
               );
         }
      } else {
         return new IiiiIIlliiiIIl(lIIiiiIIii.lillIlIliillIlIl, null, "");
      }
   }
}
