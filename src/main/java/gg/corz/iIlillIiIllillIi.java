package gg.corz;

import java.util.Locale;

public record iIlillIiIllillIi(long targetRegion, long playerComponent, long accessAssetSet, int entrySide, int strategy, long failureFingerprint) {
   private final long lillIIlIIi;
   private final int lIilIIlIIi;
   private final long IlilIIlIIi;
   private final long iillIIlIIi;
   private final long IIilIIlIIi;
   private final int iIilIIlIIi;

   public long IilliliilIIi() {
      return this.IIilIIlIIi;
   }

   public iIlillIiIllillIi(long targetRegion, long playerComponent, long accessAssetSet, int entrySide, int strategy, long failureFingerprint) {
      this.lillIIlIIi = targetRegion;
      this.iillIIlIIi = playerComponent;
      this.IIilIIlIIi = accessAssetSet;
      this.lIilIIlIIi = entrySide;
      this.iIilIIlIIi = strategy;
      this.IlilIIlIIi = failureFingerprint;
   }

   public long liiiIIllIl() {
      return this.lillIIlIIi;
   }

   public String IliIlllilIi() {
      return String.format(
         Locale.ROOT,
         IlIlllIlilIl<"IlIlllIlilIl","6EnykqC4R/58s85AL+V9lJKA9iqH/deGxmVNwvuh19RVG99LRZKBhv8PvTZ19LO9Mw6V5vGFRukSZTDMOkFbR/1F/NSq+PExmNbz+00unERbeNhgXKI+7ZRmA5IuaYjxfjvfx5xLEmUnPJIoCUuBOtZNrg4UsLgsqeF93AKu5eLb">(),
         this.lillIIlIIi,
         this.iillIIlIIi,
         Long.toUnsignedString(this.IIilIIlIIi, 16),
         illiIlIiIiliIlIi.IliIlllilIi(this.lIilIIlIIi),
         this.iIilIIlIIi,
         Long.toUnsignedString(this.IlilIIlIIi, 16)
      );
   }

   public int lIiiIiIlilli() {
      return this.lIilIIlIIi;
   }

   public int iliIiiliiiii() {
      return this.iIilIIlIIi;
   }

   public long iIlIlllllill() {
      return this.iillIIlIIi;
   }

   public long IIIllIIliIIl() {
      return this.IlilIIlIIi;
   }
}
