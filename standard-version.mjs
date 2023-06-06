import standardVersion from 'standard-version';

(async () => {
  const a = await standardVersion({
    noVerify: true,
    dryRun: true,
    releaseCommitMessageFormat: 'chore(release): {{currentTag}} [skip-ci]',
  })
    .then((a) => {
      // standard-version is done
    })
    .catch((err) => {
      console.error(`standard-version failed with message: ${err.message}`);
    });
})();
